/**
  *  邮箱验证码controller层
 */
package com.bys.ots.controller;

import com.bys.ots.handler.exception.BusinessException;
import com.bys.ots.pojo.ResultEnum;
import com.bys.ots.util.redis.RedisUtil;
import com.bys.ots.service.MailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import javax.annotation.Resource;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
/**
 * @author bairuihua
 * 2019/11/25
 */
@Api(value = "Mail Controller")
@RestController
@RequestMapping(value="v1")
public class MailController
{
    @Resource
    private MailService mailService;

    @Autowired
    RedisUtil redisUtil;

    private final Logger logger = LoggerFactory.getLogger(MailController.class);

    @ApiOperation(value = "get Check Code")
    @ApiImplicitParam
    (
//         name = "email", value = "邮箱地址", required = true, dataType = "String"
     )
    @PostMapping(value = "/getCheckCode")
    public String getCheckCode(@RequestBody String email)
    {
    	logger.info("->Start to send the email checkCode, the email info is：" +email);
    	
        if (StringUtils.isEmpty(email))
        {
        	logger.error("->email is empty! the email address is：" +email);
            throw new BusinessException(ResultEnum.CODE_400);
        }
        
        return mailService.sendVerifyCode(email);
    }     

}
