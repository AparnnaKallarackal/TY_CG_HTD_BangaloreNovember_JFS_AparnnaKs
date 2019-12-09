package com.cg.forestrymanagementapp.bean;

import java.io.Serializable;

public class ContractBean implements Serializable {
	private int contractNo;
	private int customerId;
	private int productId;
	private int haulierId;
	private String deiveryDate;
	private String deliveryDay;
	private int quantity;
	public int getContractNo() {
		return contractNo;
	}
	public void setContractNo(int contractNo) {
		this.contractNo = contractNo;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getHaulierId() {
		return haulierId;
	}
	public void setHaulierId(int haulierId) {
		this.haulierId = haulierId;
	}
	public String getDeiveryDate() {
		return deiveryDate;
	}
	public void setDeiveryDate(String deiveryDate) {
		this.deiveryDate = deiveryDate;
	}
	public String getDeliveryDay() {
		return deliveryDay;
	}
	public void setDeliveryDay(String deliveryDay) {
		this.deliveryDay = deliveryDay;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ContractBean [contractNo=" + contractNo + ", customerId=" + customerId + ", productId=" + productId
				+ ", haulierId=" + haulierId + ", deiveryDate=" + deiveryDate + ", deliveryDay=" + deliveryDay
				+ ", quantity=" + quantity + "]";
	}
	

}
