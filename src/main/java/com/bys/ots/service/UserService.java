/**
 * 用户信息service接口
 */
package com.bys.ots.service;

import java.util.List;

import com.bys.ots.model.User;
import com.bys.ots.pojo.Result;
/**
 * 
 * @author bairuihua
 *  2019/11/26
 */
public interface UserService
{
    Result login(String rawData);

    Result register(String rawData);

    // List findAllUser();
    //
    // int findAllUserCount();
    //
    // User findByEmailAndPassword(User userinfo);
    //
    // int insertUser(User userinfo);
    //
    // User findByEmail(User userinfo);
    //
    // User findById(User userinfo);
    //
    // User findByEmail2(String email);

}
