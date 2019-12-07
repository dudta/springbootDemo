package com.bys.ots.dao;

import com.bys.ots.model.SoEmailSap;
import com.bys.ots.model.SoEmailSapExample;
import com.bys.ots.model.SoEmailSapKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhagnyan
 * 2019/11/28
 */
@Mapper
public interface SoEmailSapMapper {
    int countByExample(SoEmailSapExample example);

    int deleteByExample(SoEmailSapExample example);

    int deleteByPrimaryKey(SoEmailSapKey key);

    int insert(SoEmailSap record);

    int insertSelective(SoEmailSap record);

    List<SoEmailSap> selectByExample(SoEmailSapExample example);

    SoEmailSap selectByPrimaryKey(SoEmailSapKey key);

    int updateByExampleSelective(@Param("record") SoEmailSap record, @Param("example") SoEmailSapExample example);

    int updateByExample(@Param("record") SoEmailSap record, @Param("example") SoEmailSapExample example);

    int updateByPrimaryKeySelective(SoEmailSap record);

    int updateByPrimaryKey(SoEmailSap record);
    
    int InsertList(@Param("mlist")List<SoEmailSap> mlist);
}