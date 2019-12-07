/**
 * 用户信息dao层
 */
package com.bys.ots.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.bys.ots.model.User;

/**
 * @author bairuihua
 * 2019/11/25
 */

@Mapper
public interface UserMapper
{

    int insert(User record);

    int insertSelective(User record);

    List findAllUser();

    int findAllUserCount();

    User findByEmailAndPassword(@Param("email")String email, @Param("password")String password);

    int insertUser(User userinfo);
    
    User findByEmail2(@Param("email")String email);

    List<User> findByEmail(@Param("email")String email);

    User findByUser(User userinfo); 
    
    User findByUserId(@Param("userId")String userId);

    User findByOpenId(@Param("openId")String openId);
}
