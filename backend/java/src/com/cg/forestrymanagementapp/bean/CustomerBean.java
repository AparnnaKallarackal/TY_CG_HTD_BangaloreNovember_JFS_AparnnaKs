package com.cg.forestrymanagementapp.bean;

import java.io.Serializable;

public class CustomerBean implements Serializable{
	private int custId;
	private String custName;
	private String  custAddress1;
	private String custAddress2;
	private String custTown;
	private String custEmail;
	private long custPhNum;
	private int custPostalCode;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress1() {
		return custAddress1;
	}
	public void setCustAddress1(String custAddress1) {
		this.custAddress1 = custAddress1;
	}
	public String getCustAddress2() {
		return custAddress2;
	}
	public void setCustAddress2(String custAddress2) {
		this.custAddress2 = custAddress2;
	}
	public String getCustTown() {
		return custTown;
	}
	public void setCustTown(String custTown) {
		this.custTown = custTown;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public long getCustPhNum() {
		return custPhNum;
	}
	public void setCustPhNum(long custPhNum) {
		this.custPhNum = custPhNum;
	}
	public int getCustPostalCode() {
		return custPostalCode;
	}
	public void setCustPostalCode(int custPostalCode) {
		this.custPostalCode = custPostalCode;
	}
	@Override
	public String toString() {
		return "CustomerBean [custId=" + custId + ", custName=" + custName + ", custAddress1=" + custAddress1
				+ ", custAddress2=" + custAddress2 + ", custTown=" + custTown + ", custEmail=" + custEmail
				+ ", custPhNum=" + custPhNum + ", custPostalCode=" + custPostalCode + "]";
	}
	
}
