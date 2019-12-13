package com.cg.phonesimulatorapp.bean;

import java.io.Serializable;

import lombok.Data;
@Data
public class Contact implements Serializable{
	private String name;
	private long number;
	private String group;

}
