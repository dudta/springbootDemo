package com.bys.ots.dao;

import com.bys.ots.model.UserFlow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserFlowMapper
{
    int insert(UserFlow record);
    List<UserFlow>findByUserId(@Param("userId")String userId);
}
