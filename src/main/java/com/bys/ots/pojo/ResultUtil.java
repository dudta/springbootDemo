/**
 * resultUtil类
 */
package com.bys.ots.pojo;
/**
 * @author bairuihua
 * 2019/11/25
 */
public class ResultUtil
{
    public static <T> Result<T> OTSResult(T data)
    {
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(data);
        return result;
    }

    public static Result success()
    {
        return OTSResult(null);
    }

    public static Result error(String code, String msg)
    {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static Result error(ResultEnum resultEnum)
    {
        Result result = new Result();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMsg());
        return result;
    }
}
