/**
 * mailUtil类
 */
package com.bys.ots.util;

import java.io.File;
import java.util.List;

import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
/**
 * 
 * @author bairuihua
 *  2019/11/26
 */
public class MailUtil
{
    Logger logger = LoggerFactory.getLogger(this.getClass());

    public String getRandomCode()
    {

        String model = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] m = model.toCharArray();
        String randomcode = "";
        for (int j = 0; j < 6; j++)
        {
            char c = m[(int) (Math.random() * 36)];
            // 保证六位随机数之间没有重复的
            if (randomcode.contains(String.valueOf(c)))
            {
                j--;
                continue;
            }
            randomcode = randomcode + c;
        }
        return randomcode;
    }

//    public void sendAttachmentsMail(String to, String title, String cotent, List<File> fileList)
//    {
//
//        MimeMessage message = mailSender.createMimeMessage();
//
//        try
//        {
//            MimeMessageHelper helper = new MimeMessageHelper(message, true);
//            helper.setFrom(from);
//            helper.setTo(to);
//            helper.setSubject(title);
//            helper.setText(cotent);
//            String fileName = null;
//            for (File file : fileList)
//            {
//                fileName = MimeUtility.encodeText(file.getName(), "GB2312", "B");
//                helper.addAttachment(fileName, file);
//            }
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        mailSender.send(message);
//        logger.info("邮件发送成功");
//    }

}
