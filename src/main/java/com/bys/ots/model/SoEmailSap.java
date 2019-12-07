package com.bys.ots.model;
/**
 * @author zhagnyan
 * 2019/11/27
 */
import java.io.Serializable;

public class SoEmailSap extends SoEmailSapKey implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String partner;

    private String customer;

    private String email;

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
	
}