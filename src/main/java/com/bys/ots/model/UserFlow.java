/**
 * 实体类用户表
 */
package com.bys.ots.model;

import java.io.Serializable;

/**
 * @author bairuihua
 *  2019/11/25
 */
public class UserFlow implements Serializable
{

    private static final long serialVersionUID = 1L;

    //唯一标识号
    private String id;

    //种类
    private String catagory;

    //描述
    private String description;

    //用户Id
    private String userId;

    //用户操作
    private String operate;

    //参数
    private Object args;

    //更新时间
    private String time;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getCatagory()
    {
        return catagory;
    }

    public void setCatagory(String catagory)
    {
        this.catagory = catagory;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getOperate()
    {
        return operate;
    }

    public void setOperate(String operate)
    {
        this.operate = operate;
    }

    public Object getArgs()
    {
        return args;
    }

    public void setArgs(String args)
    {
        this.args = args;
    }

    public String getTime()
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    @Override
    public String toString()
    {
        return "UserFlow{" +
                "id='" + id + '\'' +
                ", catagory='" + catagory + '\'' +
                ", description='" + description + '\'' +
                ", userId='" + userId + '\'' +
                ", operate='" + operate + '\'' +
                ", args=" + args +
                ", time='" + time + '\'' +
                '}';
    }
}