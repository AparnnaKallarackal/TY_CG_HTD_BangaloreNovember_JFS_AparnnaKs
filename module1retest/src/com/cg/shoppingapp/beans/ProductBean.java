package com.cg.shoppingapp.beans;

import java.io.Serializable;

import lombok.Data;
@Data
public class ProductBean implements Serializable {
	private int proId;
	private String proName;
	private double proCost;
	private String proColor;
	private String des;
	private int numOfPro;
}
