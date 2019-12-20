/**
 * 邮件service接口
 */
package com.bys.ots.service;

import com.bys.ots.pojo.Result;

/**
 * 
 * @author bairuihua
 *  2019/11/26
 */
public interface MailService {

	Result sendVerifyCode(String email);
}
