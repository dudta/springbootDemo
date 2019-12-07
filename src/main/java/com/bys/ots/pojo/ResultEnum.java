/**
 * 错误码定义
 */
package com.bys.ots.pojo;

/**
 * @author bairuihua
 * 2019/11/25
 */

public enum ResultEnum
{

    CODE_400("400", "邮箱为空"),
    CODE_401("401", "验证码发送失败"), 
    CODE_402("402", "用户名或密码错误"),
    CODE_403("403", "验证码不正确"), 
    CODE_404("404", "用户未注册"), 
    CODE_405("405", "该邮箱已被注册！"),
    CODE_406("406", "订单编号为空"), 
    CODE_407("407", "用户名密码不正确"),
    CODE_408("408", "物流信息异常"),
    CODE_409("409", "rowData参数不正确"), 
    CODE_410("410", "userId为空"),  
    CODE_411("411", "用户不存在"), 
    CODE_412("412", "用户未注册"),
    CODE_413("413", "JSON格式错误"),
    CODE_414("414", "pageNum为空"),
    CODE_415("415", "pageSize为空"),
    CODE_416("416", "type参数错误"),
    CODE_417("417", "密码错误"),
    SUCCESS("200", "ok");

    private String code;

    private String msg;

    ResultEnum(String code, String msg)
    {
        this.code = code;
        this.msg = msg;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }
}
