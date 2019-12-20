package com.bys.ots.config;

import com.bys.ots.dao.UserFlowMapper;
import com.bys.ots.model.User;
import com.bys.ots.model.UserFlow;
import org.apache.commons.lang.ObjectUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.UUID;

@Aspect
@Component
public class UserFlowAspect
{
    @Resource
    private UserFlowMapper userFlowMapper;

    private Logger logger = LoggerFactory.getLogger(getClass());

    //getSoInfoList  getSoInfoDetail  getLogisticInfo
    @Pointcut("execution(public * com.bys.ots.controller.OrderController.getSoInfoList(..))")
    public void getSoInfoList()
    {
    }
    @Pointcut("execution(public * com.bys.ots.controller.OrderController.getSoInfoDetail(..))")
    public void getSoInfoDetail()
    {
    }
    @Pointcut("execution(public * com.bys.ots.controller.OrderController.getLogisticInfo(..))")
    public void getLogisticInfo()
    {
    }
    @Before("getSoInfoList()")
    public void getSoInfoList(JoinPoint joinPoint) throws Throwable
    {
        UserFlow userFlow = new UserFlow();
        String uuid = UUID.randomUUID().toString();
        userFlow.setId(uuid);
        HttpSession session = (HttpSession) joinPoint.getArgs()[1];
        String userId = "";
        if (!ObjectUtils.equals(session,null)) {
            User user = (User)session.getAttribute("user");
            if (!ObjectUtils.equals(user,null)) {
                userId = user.getUserId();
            }
        }
        userFlow.setUserId(userId);
        userFlow.setOperate("3");
        userFlow.setCatagory("v1/getSoInfoList");
        userFlow.setDescription("查询订单列表");
        userFlow.setOperate("3");
        userFlow.setArgs(Arrays.asList(joinPoint.getArgs()).toString());
        userFlowMapper.insert(userFlow);
    }

    @Before("getSoInfoDetail()")
    public void getSoInfoDetail(JoinPoint joinPoint) throws Throwable
    {
        UserFlow userFlow = new UserFlow();
        String uuid = UUID.randomUUID().toString();
        userFlow.setId(uuid);
        int length = joinPoint.getArgs().length -1;
        HttpSession session = (HttpSession) joinPoint.getArgs()[length];
        String userId = "";
        if (!ObjectUtils.equals(session,null)) {
            User user = (User)session.getAttribute("user");
            if (!ObjectUtils.equals(user,null)) {
                userId = user.getUserId();
            }
        }
        userFlow.setUserId(userId);
        userFlow.setOperate("3");
        userFlow.setCatagory("v1/getSoInfoDetail");
        userFlow.setDescription("查询订单詳情");
        userFlow.setOperate("3");
        userFlow.setArgs(Arrays.asList(joinPoint.getArgs()).toString());
        userFlowMapper.insert(userFlow);
    }
    @Before("getLogisticInfo()")
    public void getLogisticInfo(JoinPoint joinPoint) throws Throwable
    {
        UserFlow userFlow = new UserFlow();
        String uuid = UUID.randomUUID().toString();
        userFlow.setId(uuid);
        int length = joinPoint.getArgs().length -1;
        HttpSession session = (HttpSession) joinPoint.getArgs()[length];
        String userId = "";
        if (!ObjectUtils.equals(session,null)) {
            User user = (User)session.getAttribute("user");
            if (!ObjectUtils.equals(user,null)) {
                userId = user.getUserId();
            }
        }
        userFlow.setUserId(userId);
        userFlow.setOperate("3");
        userFlow.setCatagory("v1/getLogisticInfo");
        userFlow.setDescription("查询物流信息");
        userFlow.setOperate("3");
        userFlow.setArgs(Arrays.asList(joinPoint.getArgs()).toString());
        userFlowMapper.insert(userFlow);
    }
}
