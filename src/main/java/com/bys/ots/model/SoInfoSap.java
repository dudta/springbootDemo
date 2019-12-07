package com.bys.ots.model;

import java.io.Serializable;
/**
 * @author zhagnyan
 * 2019/11/27
 */
public class SoInfoSap extends SoInfoSapKey implements Serializable{
    /**
     * @param so
     * @param soItem
     */
    public SoInfoSap(String so, String soItem)
    {
        super(so, soItem);
        // TODO Auto-generated constructor stub
    }

    /**
     * 
     */
    public SoInfoSap()
    {
        // TODO Auto-generated constructor stub
    }

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String poNumber;

    private String soldTo;

    private String saleOrg;

    private String saleOffice;

    private String disC;

    private Integer sku;

    private Integer soStatus;

    private String description;

    private Integer qty;

    private String unit;
    private String type;
    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public String getSoldTo() {
        return soldTo;
    }

    public void setSoldTo(String soldTo) {
        this.soldTo = soldTo;
    }

    public String getSaleOrg() {
        return saleOrg;
    }

    public void setSaleOrg(String saleOrg) {
        this.saleOrg = saleOrg;
    }

    public String getSaleOffice() {
        return saleOffice;
    }

    public void setSaleOffice(String saleOffice) {
        this.saleOffice = saleOffice;
    }

    public String getDisC() {
        return disC;
    }

    public void setDisC(String disC) {
        this.disC = disC;
    }

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public Integer getSoStatus() {
        return soStatus;
    }

    public void setSoStatus(Integer soStatus) {
        this.soStatus = soStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
    
}