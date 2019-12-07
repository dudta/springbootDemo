package com.bys.ots.model;
/**
 * @author zhagnyan
 * 2019/11/27
 */
public class SoEmailSapKey {
    private String so;

    private String soItem;

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

	@Override
	public String toString() {
		return "SoEmailSapKey [so=" + so + ", soItem=" + soItem + "]";
	}
}