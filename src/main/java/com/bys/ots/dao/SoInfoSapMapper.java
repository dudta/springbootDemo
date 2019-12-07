package com.bys.ots.dao;

import com.bys.ots.model.SoInfoSap;
import com.bys.ots.model.SoInfoSapExample;
import com.bys.ots.model.SoInfoSapKey;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
/**
 * @author zhagnyan
 * 2019/11/28
 */
@Mapper
public interface SoInfoSapMapper {
    int countByExample(SoInfoSapExample example);

    int deleteByExample(SoInfoSapExample example);

    int deleteByPrimaryKey(SoInfoSapKey key);

    int insert(SoInfoSap record);

    int insertSelective(SoInfoSap record);

    List<SoInfoSap> selectByExample(SoInfoSapExample example);

    SoInfoSap selectByPrimaryKey(SoInfoSapKey key);

    int updateByExampleSelective(@Param("record") SoInfoSap record, @Param("example") SoInfoSapExample example);

    int updateByExample(@Param("record") SoInfoSap record, @Param("example") SoInfoSapExample example);

    int updateByPrimaryKeySelective(SoInfoSap record);

    int updateByPrimaryKey(SoInfoSap record);

	int insertBatch(@Param("data") List<SoInfoSap> data);
}