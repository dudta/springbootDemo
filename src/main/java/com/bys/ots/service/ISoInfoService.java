/**
 * 订单信息service接口
 */
package com.bys.ots.service;

import com.bys.ots.pojo.Result;

/**
 * @author bairuihua
 * 2019/11/26
 */
public interface ISoInfoService
{
    Result getSoInfoList(String email);

    Result getSoInfoDetail(String orderId, String type);

    /**
     * @param type
     * @param so
     * @param soItem
     * @return
     */
    Result getLogisticInfo(String type, String so, String soItem);
}
