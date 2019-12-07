/**
 * 邮箱service实现类
 */
package com.bys.ots.service.impl;
import javax.mail.internet.MimeMessage;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.bys.ots.config.RedisExceptionCache;
import com.bys.ots.handler.exception.BusinessException;
import com.bys.ots.handler.exception.RedisConnectionException;
import com.bys.ots.pojo.ConstantModel;
import com.bys.ots.pojo.ResultEnum;
import com.bys.ots.util.redis.RedisUtil;

import net.sf.json.JSONObject;

import com.bys.ots.service.MailService;
import com.bys.ots.util.MailUtil;
/**
 * 
 * @author bairuihua
 *  2019/11/26
 */
@Service("mailService")
public class MailServiceImpl implements MailService{
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Value("${spring.mail.username}")
	private String from;

	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	private RedisUtil redisUtil;
	
	@Autowired
    ConstantModel constantModel;

	@Override
	public String sendVerifyCode(String email) {
	    
	    JSONObject jsonObj = JSONObject.fromObject(email);
        email = jsonObj.getString("email");
        email = email.replaceAll("\"", "");
        if (StringUtils.isEmpty(email))
        {
            logger.error("->email is empty! the email address is：" +email);
            throw new BusinessException(ResultEnum.CODE_400);
        }
        MailUtil mutil= new MailUtil();
        String checkCode = mutil.getRandomCode();
        try
        {
            sendVerificationMail(email, "Thermo Fisher System Verification Code", checkCode);
            try
            {
                redisUtil.set(email, checkCode, 0);
                Long resExpire = redisUtil.expire(email, 180, 0);
            }
            catch (RedisConnectionException e)
            {
            	//如果Redis异常，将验证码存入内存中
                if (RedisExceptionCache.backMap.size() >= 1000)
                {
                    RedisExceptionCache.backMap.clear();
                }
                RedisExceptionCache.backMap.put(email, checkCode);
            }
            
            logger.info(email + "发送的验证码为：{}", checkCode);
        }
        catch (Exception e)
        {
        	logger.error("->验证码发送环节失败！！！验证码为： "+checkCode);
            throw new BusinessException(ResultEnum.CODE_401);
        }
        return "验证码发送成功";
    }
		
	public void sendVerificationMail(String to, String title, String code) {

		try {
			MimeMessage mimeMessage = mailSender.createMimeMessage();
			MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
			messageHelper.setFrom(from);
			messageHelper.setSubject(title);
			messageHelper.setTo(to);
			messageHelper.setText(
					constantModel.getVerificationEmailHeader() + code + constantModel.getVerificationEmailBody(), true);

			mailSender.send(mimeMessage);
			logger.info("验证码邮件发送成功！");
		} catch (Exception e) {
			logger.info("异常信息：" + e);
		}
	}

	
}
