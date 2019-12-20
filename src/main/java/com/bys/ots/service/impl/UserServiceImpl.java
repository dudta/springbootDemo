/**
 * 用户信息管理实现类
 */
package com.bys.ots.service.impl;

import com.bys.ots.config.RedisExceptionCache;
import com.bys.ots.dao.UserMapper;
import com.bys.ots.handler.exception.RedisConnectionException;
import com.bys.ots.model.User;
import com.bys.ots.pojo.Result;
import com.bys.ots.pojo.ResultEnum;
import com.bys.ots.pojo.ResultUtil;
import com.bys.ots.service.UserService;
import com.bys.ots.util.redis.RedisUtil;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.UUID;

/**
 * @author bairuihua
 * 2019/11/26
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService
{
    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private UserMapper userMapper;

    @Autowired
    RedisUtil redisUtil;

    @Override
    public Result login(String rawData, HttpSession session)
    {
        JSONObject jsonObj = JSONObject.fromObject(rawData);

        String openId = (String) jsonObj.get("openId");

        if (StringUtils.isEmpty(openId))
        {
            logger.error("->The user login param is empty,openId: " + openId);
            return ResultUtil.error(ResultEnum.CODE_409);
        }
        User user = userMapper.findByOpenId(openId);
        if (ObjectUtils.isEmpty(user))
        {
            logger.info("->User can not be found by this openId: {}", openId);
            return ResultUtil.error(ResultEnum.CODE_412);
        }
        session.setAttribute("user", user);
        return ResultUtil.OTSResult(user.getEmail());
    }

    @Override
    public Result register(String rawData, HttpSession session)
    {

        JSONObject jsonObj = JSONObject.fromObject(rawData);

        String email = (String) jsonObj.get("emailAddress");
        String password = (String) jsonObj.get("password");
        String checkCode = (String) jsonObj.get("checkCode");

        if (StringUtils.isEmpty(email) || StringUtils.isEmpty(password)
                || StringUtils.isEmpty(checkCode))
        {
            logger.error("->The user register param is empty,email: " + email + " ,password: "
                                 + password + " ,checkCode: " + checkCode);
            return ResultUtil.error(ResultEnum.CODE_404);
        }
        // Redis验证码
        String res = "";
        try
        {
            res = redisUtil.get(email, 0);
        }
        catch (RedisConnectionException e)
        {
            try
            {
                res = RedisExceptionCache.backMap.get(email).toString();
            }
            catch (Exception e1)
            {
                logger.error("->验证码不正确!, res: " + res + ", checkCode: " + checkCode);
                return ResultUtil.error(ResultEnum.CODE_403);
            }
        }

        logger.info("验证码：res:" + res + "checkCode:" + checkCode);

        if (!StringUtils.equals(res, checkCode))
        {
            logger.error("->验证码不正确!, res: " + res + ", checkCode: " + checkCode);
            return ResultUtil.error(ResultEnum.CODE_403);
        }


        // 判断用户是否已经存在
        List<User> findUser = userMapper.findByEmail(email);
        if (!ObjectUtils.isEmpty(findUser))
        {
            logger.error("->该邮箱已被注册, email: " + email);
            return ResultUtil.error(ResultEnum.CODE_405);
        }
        if (ObjectUtils.isEmpty(findUser))
        {
            String uuid = UUID.randomUUID().toString();
            User newUser = new User();
            newUser.setUserId(uuid);
            newUser.setEmail(email);
            newUser.setOpenId(password);
            newUser.setIsDeleted(0);
            int insert = userMapper.insertUser(newUser);
            if (insert > 0)
            {
                session.setAttribute("user", newUser);
                logger.info("用户被成功创建：｛｝" + newUser);
                return ResultUtil.OTSResult(email);
            }
        }
        logger.info("->Register param error: {}", findUser);
        return ResultUtil.error(ResultEnum.CODE_404);
    }

    @Override
    public Result deleteEmail(String rowData)
    {
        logger.error("->The user enter service deleteEmail param is rowData:{}", rowData);
        JSONObject jsonObj = JSONObject.fromObject(rowData);
        String email = (String) jsonObj.get("email");
        if (StringUtils.isEmpty(email))
        {
            logger.error("->email is empty,email:{} ", email);
            return ResultUtil.error(ResultEnum.CODE_409);
        }
        int update = userMapper.deleteByEmail(email);
        if (update >= 1) {
            return ResultUtil.success();
        }
        return ResultUtil.error(ResultEnum.CODE_404);
    }
}
