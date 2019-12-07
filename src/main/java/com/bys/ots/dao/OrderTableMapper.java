/**
 * 订单信息dao层接口
 * 
 */
package com.bys.ots.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.bys.ots.model.OrderTable;
import com.bys.ots.model.User;

/**
 * @author bairuihua
 * 2019/11/25
 */

@Mapper
public interface OrderTableMapper
{

//    int insert(OrderTable record);

//    List<OrderTable> findByOrderTable(OrderTable record);
    
//  List<OrderTable> findOrderByUser(User user);
//
 

    List<OrderTable> findByOrderId(@Param("orderId")String orderId);
    
    List<OrderTable> findByEmail(@Param("email")String email);
}
