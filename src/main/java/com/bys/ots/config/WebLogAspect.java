package com.bys.ots.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class WebLogAspect
{

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Pointcut("execution(public * com.bys.ots.service.impl..*.*(..))")
    public void webLog()
    {
    }

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable
    {
        //类方法 参数
        logger.info("class method={}, args={}",
                    joinPoint.getSignature().getDeclaringTypeName() + "." +
                            joinPoint.getSignature().getName(),
                    Arrays.toString(joinPoint.getArgs()));
    }
}
