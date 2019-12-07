package com.bys.ots.model;
/**
 * @author zhagnyan
 * 2019/11/27
 */
public class DnInfoSapKey {
    private String dn;

    private String dnItem;

    /**
     * @param so
     * @param soItem
     */
    public DnInfoSapKey(String so, String soItem)
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * 
     */
    public DnInfoSapKey()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public String getDnItem() {
        return dnItem;
    }

    public void setDnItem(String dnItem) {
        this.dnItem = dnItem;
    }
}