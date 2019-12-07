/**
 * 实体类 订单表
 * 
 */
package com.bys.ots.model;
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author bairuihua
 *  2019/11/25
 */
public class OrderTable implements Serializable
{

    private static final long serialVersionUID = 1L;
    //订单编号
    private String orderId;
    //E1订单编号
    private String e1OrderId;
    //商品库存单位
    private String sku;
    //商品中心
    private String promptGoodCenterName;
    //价格
    private String sale;
    //商品收货人
    private String goodReceiver;
    //用户账户
    private String userCountId;
    //订单状态
    private String orderState;
    //订单分类
    private String orderType;
    //订单下单时间
    private Date purchaseTime;
    //订单是否被删除
    private Integer isDeleted;
    //订单发货中心Id
    private String distributionCenterId;
    //订单下单人Id
    private String userId;
   
    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getOrderId()
    {
        return orderId;
    }

    public String getDistributionCenterId()
    {
        return distributionCenterId;
    }

    public void setDistributionCenterId(String distributionCenterId)
    {
        this.distributionCenterId = distributionCenterId;
    }

    public void setOrderId(String orderId)
    {
        this.orderId = orderId;
    }

    public String getE1OrderId()
    {
        return e1OrderId;
    }

    public void setE1OrderId(String e1OrderId)
    {
        this.e1OrderId = e1OrderId;
    }

    public String getSku()
    {
        return sku;
    }

    public void setSku(String sku)
    {
        this.sku = sku;
    }

    public String getPromptGoodCenterName()
    {
        return promptGoodCenterName;
    }

    public void setPromptGoodCenterName(String promptGoodCenterName)
    {
        this.promptGoodCenterName = promptGoodCenterName;
    }

    public String getSale()
    {
        return sale;
    }

    public void setSale(String sale)
    {
        this.sale = sale;
    }

    public String getGoodReceiver()
    {
        return goodReceiver;
    }

    public void setGoodReceiver(String goodReceiver)
    {
        this.goodReceiver = goodReceiver;
    }

    public String getUserCountId()
    {
        return userCountId;
    }

    public void setUserCountId(String userCountId)
    {
        this.userCountId = userCountId;
    }

    public String getOrderState()
    {
        return orderState;
    }

    public void setOrderState(String orderState)
    {
        this.orderState = orderState;
    }

    public String getOrderType()
    {
        return orderType;
    }

    public void setOrderType(String orderType)
    {
        this.orderType = orderType;
    }

    public Date getPurchaseTime()
    {
        return purchaseTime;
    }

    public void setPurchaseTime(Date purchaseTime)
    {
        this.purchaseTime = purchaseTime;
    }

    public Integer getIsDeleted()
    {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted)
    {
        this.isDeleted = isDeleted;
    }



 

}
