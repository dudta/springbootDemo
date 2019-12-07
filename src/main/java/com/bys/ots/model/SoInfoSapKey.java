package com.bys.ots.model;
/**
 * @author zhagnyan
 * 2019/11/27
 */
public class SoInfoSapKey {
    private String so;

    private String soItem;

    /**
     * @param so2
     * @param soItem2
     */
    

    public String getSo() {
        return so;
    }

    /**
     * @param so
     * @param soItem
     */
    
    public SoInfoSapKey(String so, String soItem)
    {
        super();
        this.so = so;
        this.soItem = soItem;
    }

    /**
     * 
     */
    public SoInfoSapKey()
    {
        super();
        // TODO Auto-generated constructor stub
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
}