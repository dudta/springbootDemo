/**
 * 实体类 订单表
 */
package com.bys.ots.model;

import org.apache.http.client.utils.DateUtils;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author bairuihua
 * 2019/11/25
 */
public class SoInfo implements Serializable
{

    private static final long serialVersionUID = 1L;

    //订单号
    private String so;

    //订单-行号
    private String soItem;

    //合同号1
    private String poNumber;

    //售达方代码1
    private String soldToCode;

    //售达方名称
    private String soldToName;

    //送达方代码
    private String shipToCode;

    //送达方名称
    private String shipToName;

    //订单日期
    private String soCreateDate;

    //订单状态
    private String deliveryStatus;

    private String salePersonName;

    private String salePersonPhone;

    private String salePersonEmail;

    private String type;

    public String getSoItem()
    {
        return soItem;
    }

    public void setSoItem(String soItem)
    {
        this.soItem = soItem;
    }

    public String getSo()
    {
        return so;
    }

    public void setSo(String so)
    {
        this.so = so;
    }

    public String getPoNumber()
    {
        return poNumber;
    }

    public void setPoNumber(String poNumber)
    {
        this.poNumber = poNumber;
    }

    public String getSoldToCode()
    {
        return soldToCode;
    }

    public void setSoldToCode(String soldToCode)
    {
        this.soldToCode = soldToCode;
    }

    public String getSoldToName()
    {
        return soldToName;
    }

    public void setSoldToName(String soldToName)
    {
        this.soldToName = soldToName;
    }

    public String getShipToCode()
    {
        return shipToCode;
    }

    public void setShipToCode(String shipToCode)
    {
        this.shipToCode = shipToCode;
    }

    public String getShipToName()
    {
        return shipToName;
    }

    public void setShipToName(String shipToName)
    {
        this.shipToName = shipToName;
    }

    public String getSoCreateDate()
    {
        return soCreateDate;
    }

    public void setSoCreateDate(String soCreateDate)
    {
        this.soCreateDate = soCreateDate;
    }

    public String getDeliveryStatus()
    {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus)
    {
        this.deliveryStatus = deliveryStatus;
    }

    public String getSalePersonName()
    {
        return salePersonName;
    }

    public void setSalePersonName(String salePersonName)
    {
        this.salePersonName = salePersonName;
    }

    public String getSalePersonPhone()
    {
        return salePersonPhone;
    }

    public void setSalePersonPhone(String salePersonPhone)
    {
        this.salePersonPhone = salePersonPhone;
    }

    public String getSalePersonEmail()
    {
        return salePersonEmail;
    }

    public void setSalePersonEmail(String salePersonEmail)
    {
        this.salePersonEmail = salePersonEmail;
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
