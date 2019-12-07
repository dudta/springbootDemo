/**
 * 订单信息service接口
 */
package com.bys.ots.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.bys.ots.model.OrderTable;
import com.bys.ots.model.User;
import com.bys.ots.pojo.Result;
/**
 * 
 * @author bairuihua
 *  2019/11/26
 */
public interface IOrderTableService
{
//    int insert(OrderTable record);
//
//    List<OrderTable> findByOrderTable(OrderTable record);
//
//    List<OrderTable> findByRequestOrderTable(OrderTableRequest record);
    
    Result getOderTableList(String email);
    Result getOderDetail(String orderId);
    /**
     * @param type
     * @param so
     * @param soItem
     * @return
     */
    Result getLogisticInfo(String type, String so, String soItem);
}
