/**
 * 邮件service接口
 */
package com.bys.ots.service;
/**
 * 
 * @author bairuihua
 *  2019/11/26
 */
public interface MailService {

	String sendVerifyCode(String email);
}
