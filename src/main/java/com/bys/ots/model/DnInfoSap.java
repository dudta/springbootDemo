package com.bys.ots.model;

import java.io.Serializable;
/**
 * @author zhagnyan
 * 2019/11/27
 */
public class DnInfoSap extends DnInfoSapKey implements Serializable{
    /**
     * 
     */
    public DnInfoSap()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @param so
     * @param soItem
     */
    public DnInfoSap(String so, String soItem)
    {
        super(so, soItem);
        // TODO Auto-generated constructor stub
    }

    /**
     * 
     */
     

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String so;

    private String soItem;

    private String plant;

    private String storLoc;

    private String shippingPoint;

    private Integer dnStatus;

    private String deliveryDate;

    private Integer qty;

    private String unit;

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getSoItem() {
        return soItem;
    }

    public void setSoItem(String soItem) {
        this.soItem = soItem;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public String getStorLoc() {
        return storLoc;
    }

    public void setStorLoc(String storLoc) {
        this.storLoc = storLoc;
    }

    public String getShippingPoint() {
        return shippingPoint;
    }

    public void setShippingPoint(String shippingPoint) {
        this.shippingPoint = shippingPoint;
    }

    public Integer getDnStatus() {
        return dnStatus;
    }

    public void setDnStatus(Integer dnStatus) {
        this.dnStatus = dnStatus;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
}