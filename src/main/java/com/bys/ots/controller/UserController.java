/**
 * 用户状态controller层
 */
package com.bys.ots.controller;

import com.bys.ots.pojo.Result;
import com.bys.ots.pojo.ResultEnum;
import com.bys.ots.pojo.ResultUtil;
import com.bys.ots.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author bairuihua
 * 2019/11/25
 */

@Api(value = "User Controller")
@RestController
@RequestMapping(value = "v1")
public class UserController
{
    @Resource
    private UserService userService;

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @ApiOperation(value = "Login")
    @ApiImplicitParams
            ({
                    @ApiImplicitParam(name = "rawData", paramType = "body", value = "请求体", required = true, defaultValue = "{mobile:\"\";password:\"\";checkCode:\"\"}")
            })
    @PostMapping(value = "/login")
    public Result login(@RequestBody String rawData, HttpSession session)
    {
        logger.info("->User start to login the system, the login info is：" + rawData);

        if (StringUtils.isEmpty(rawData))
        {
            logger.error("->User start to login system error, the login info is：" + rawData);
            return ResultUtil.error(ResultEnum.CODE_409);
        }

        return userService.login(rawData, session);
    }

    @ApiOperation(value = "register")
    @ApiImplicitParams
            ({
                    @ApiImplicitParam(name = "rawData", paramType = "body", value = "请求体", required = true, defaultValue = "{mobile:\"\";password:\"\";checkCode:\"\"}")
            })
    @PostMapping(value = "/regist")
    public Result register(@RequestBody String rawData, HttpSession session)
    {
        logger.info("->User start to register the system, the register info is：" + rawData);

        if (StringUtils.isEmpty(rawData))
        {
            logger.error("->User start to register system error, the register info is：" + rawData);
            return ResultUtil.error(ResultEnum.CODE_409);
        }

        return userService.register(rawData, session);
    }

    @ApiOperation(value = "Delete Email")
    @ApiImplicitParams
            ({
                    @ApiImplicitParam(name = "rawData", paramType = "body", value = "请求体", required = true, defaultValue = "{email:\"\"}")
            })
    @PostMapping(value = "/deleteEmail")
    public Result deleteEmail(@RequestBody String rawData)
    {
        logger.info(
                "->User start to enter controller /deleteEmail, the request info is：" + rawData);

        if (StringUtils.isEmpty(rawData))
        {
            logger.error("->rowDate error, the request info is：" + rawData);
            return ResultUtil.error(ResultEnum.CODE_409);
        }

        return userService.deleteEmail(rawData);
    }

    @GetMapping(value = "/helloword")
    public Result helloword()
    {

        return ResultUtil.OTSResult("Helloword");
    }

}
