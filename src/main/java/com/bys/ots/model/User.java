/**
 *  实体类用户表
 */
package com.bys.ots.model;

import java.io.Serializable;

/**
 * @author bairuihua
 *  2019/11/25
 */
public class User implements Serializable
{

     
    private static final long serialVersionUID = 1L;
    //用户唯一标识号
    private String userId;
    //用户名称
    private String userName;
    //用户邮箱地址
    private String email;
    //用户地址
    private String address;
    //用户订单编号
    private String orderId;
    //用户是否别删除
    private Integer isDeleted;
    //用户密码
    private String openId;

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getOrderId()
    {
        return orderId;
    }

    public void setOrderId(String orderId)
    {
        this.orderId = orderId;
    }

    public Integer getIsDeleted()
    {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted)
    {
        this.isDeleted = isDeleted;
    }

    public String getOpenId()
    {
        return openId;
    }

    public void setOpenId(String openId)
    {
        this.openId = openId;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", orderId='" + orderId + '\'' +
                ", isDeleted=" + isDeleted +
                ", openId='" + openId + '\'' +
                '}';
    }
}