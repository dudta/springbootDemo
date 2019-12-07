/**
 * 全局业务异常
 */
package com.bys.ots.handler.exception;

import com.bys.ots.pojo.ResultEnum;

/**
 * @author bairuihua
 * 2019/11/25
 */
public class BusinessException extends RuntimeException
{

    private static final long serialVersionUID = 1L;

    private String code;

    public BusinessException()
    {
    }

    public BusinessException(ResultEnum resultEnum)
    {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }
}