/**
 * 投诉信息dao层接口
 * 
 */
package com.bys.ots.dao;

import com.bys.ots.model.Complaint;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * @author bairuihua 2019/11/25
 */

@Mapper
public interface ComplaintMapper
{
    List<Complaint> findAll();

    int insert(Complaint record);

    List<Complaint> findByUserId(@Param("userId")String userId);
    
    Complaint findById(@Param("descriptionId")String descriptionId);
}
