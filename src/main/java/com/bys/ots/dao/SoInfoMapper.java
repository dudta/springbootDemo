/**
 * 订单信息dao层接口
 */
package com.bys.ots.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.bys.ots.model.SoInfo;

/**
 * @author bairuihua
 * 2019/11/25
 */

@Mapper
public interface SoInfoMapper
{

//    int insert(OrderTable record);

//    List<OrderTable> findByOrderTable(OrderTable record);

//  List<OrderTable> findOrderByUser(User user);

    List<SoInfo> findByOrderId(@Param("orderId") String orderId);

    List<SoInfo> findByEmail(@Param("email") String email);

    List<SoInfo> selectByEmailAndStatus(@Param("email") String email,
                                        @Param("deliveryStatus") String deliveryStatus);
}
