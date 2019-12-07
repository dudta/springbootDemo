/**
 * 全局异常拦截
 */
package com.bys.ots.handler;

import com.bys.ots.controller.UserController;
import com.bys.ots.handler.exception.BusinessException;
import com.bys.ots.pojo.Result;
import com.bys.ots.pojo.ResultEnum;
import com.bys.ots.pojo.ResultUtil;

import org.apache.http.auth.AuthenticationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import net.sf.json.JSONException;
import javax.servlet.http.HttpServletRequest;
/**
 * 
 * @author bairuihua
 *  2019/11/25
 */
@RestControllerAdvice
public class GlobalDefultExceptionHandler
{

    private final Logger log = LoggerFactory.getLogger(UserController.class);

    @ExceptionHandler(BusinessException.class)
    public <T> Result<?> handlerBusiness(HttpServletRequest request, Exception e)
    {
        log.error("BusinessException：", this.getClass(), e.getMessage());
        BusinessException businessException = (BusinessException) e;
        return ResultUtil.error(businessException.getCode(), businessException.getMessage());

    }
    
    @ExceptionHandler(value = JSONException.class)
    public Result handelJSONException(HttpServletRequest request, Exception e)
    {
        
        return ResultUtil.error(ResultEnum.CODE_413);
    }

    @ExceptionHandler(value = ClassNotFoundException.class)
    public ResponseEntity<Result> handleClassNotFound(HttpServletRequest request,
                                                      ClassNotFoundException e)
    {
        Result result = new Result();
        result.setCode(HttpStatus.NOT_FOUND.toString());
        result.setMsg(e.getMessage());
        ResponseEntity<Result> responseEntity = new ResponseEntity<Result>(result,
                                                                           HttpStatus.NOT_FOUND);
        return responseEntity;
    }

    @ExceptionHandler(value = AuthenticationException.class)
    public ResponseEntity<Result> handlerAuthentication(HttpServletRequest req,
                                                        AuthenticationException e)
    {

        Result result = new Result();
        result.setCode(HttpStatus.UNAUTHORIZED.toString());
        result.setMsg(e.getMessage());
        ResponseEntity<Result> responseEntity = new ResponseEntity<Result>(result,
                                                                           HttpStatus.UNAUTHORIZED);
        return responseEntity;
    }

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Result> handleException(HttpServletRequest request, Exception e)
    {
        Result result = new Result();
        result.setCode(HttpStatus.INTERNAL_SERVER_ERROR.toString());
        result.setMsg(e.getMessage());
        ResponseEntity<Result> responseEntity = new ResponseEntity<Result>(result,
                                                                           HttpStatus.INTERNAL_SERVER_ERROR);
        return responseEntity;
    }
    

}
