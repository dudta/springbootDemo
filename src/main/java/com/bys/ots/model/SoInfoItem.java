/**
 * 实体类 订单表
 */
package com.bys.ots.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author bairuihua
 * 2019/11/25
 */
public class SoInfoItem implements Serializable
{

    private static final long serialVersionUID = 1L;

    //订单
    private String so;

    //订单-行号
    private String soItem;

    //产品代码
    private String sku;

    //产品描述
    private String description;

    //数量
    private Long qty;

    //单位
    private String unit;

    //发货单号
    private String dn;

    //发货时间
    private String deliveryPostdate;

    //发货数量
    private Long deliveryQty;

    //发货单位
    private String deliveryUnit;

    private String type;

    public String getSo()
    {
        return so;
    }

    public void setSo(String so)
    {
        this.so = so;
    }

    public String getSoItem()
    {
        return soItem;
    }

    public void setSoItem(String soItem)
    {
        this.soItem = soItem;
    }

    public String getSku()
    {
        return sku;
    }

    public void setSku(String sku)
    {
        this.sku = sku;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Long getQty()
    {
        return qty;
    }

    public void setQty(Long qty)
    {
        this.qty = qty;
    }

    public String getUnit()
    {
        return unit;
    }

    public void setUnit(String unit)
    {
        this.unit = unit;
    }

    public String getDn()
    {
        return dn;
    }

    public void setDn(String dn)
    {
        this.dn = dn;
    }

    public String getDeliveryPostdate()
    {
        return deliveryPostdate;
    }

    public void setDeliveryPostdate(String deliveryPostdate)
    {
        this.deliveryPostdate = deliveryPostdate;
    }

    public Long getDeliveryQty()
    {
        return deliveryQty;
    }

    public void setDeliveryQty(Long deliveryQty)
    {
        this.deliveryQty = deliveryQty;
    }

    public String getDeliveryUnit()
    {
        return deliveryUnit;
    }

    public void setDeliveryUnit(String deliveryUnit)
    {
        this.deliveryUnit = deliveryUnit;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
}
