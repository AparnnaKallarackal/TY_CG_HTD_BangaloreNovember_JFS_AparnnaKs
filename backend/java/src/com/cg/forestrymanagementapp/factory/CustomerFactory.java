package com.cg.forestrymanagementapp.factory;

import com.cg.forestrymanagementapp.DAO.CustomerDAO;
import com.cg.forestrymanagementapp.DAO.CustomerDAOImpl;

public class CustomerFactory {
	private CustomerFactory() {
	
	}
	public static CustomerDAO instanceOfCustomerDAOImpl() {
		CustomerDAO custDao=new CustomerDAOImpl();
		return custDao;
	}
}
