package com.cg.forestrymanagementapp.factory;

import com.cg.forestrymanagementapp.DAO.ContractDAO;
import com.cg.forestrymanagementapp.DAO.ContractDAOImpl;



public class ContractFactory {
	private ContractFactory() {
		
	}
	public static ContractDAO instanceOfContractDAOImpl() {
		ContractDAO contractDao=new ContractDAOImpl();
		return contractDao;
	}
}
