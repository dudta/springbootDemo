package com.bys.ots.dao;

import com.bys.ots.model.DnInfoSap;
import com.bys.ots.model.DnInfoSapExample;
import com.bys.ots.model.DnInfoSapKey;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhagnyan
 * 2019/11/28
 */

@Mapper
public interface DnInfoSapMapper
{
    int countByExample(DnInfoSapExample example);

    int deleteByExample(DnInfoSapExample example);

    int deleteByPrimaryKey(DnInfoSapKey key);

    int insert(DnInfoSap record);

    int insertSelective(DnInfoSap record);

    List<DnInfoSap> selectByExample(DnInfoSapExample example);

    DnInfoSap selectByPrimaryKey(DnInfoSapKey key);

    int updateByExampleSelective(@Param("record") DnInfoSap record,
                                 @Param("example") DnInfoSapExample example);

    int updateByExample(@Param("record") DnInfoSap record,
                        @Param("example") DnInfoSapExample example);

    int updateByPrimaryKeySelective(DnInfoSap record);

    int updateByPrimaryKey(DnInfoSap record);

    int InsertDnList(@Param("dlist") List<DnInfoSap> dlist);

    DnInfoSap selectBySOAndItem(@Param("so") String so, @Param("soItem") String soItem);

    List<DnInfoSap> selectBySO(@Param("so") String so);
}