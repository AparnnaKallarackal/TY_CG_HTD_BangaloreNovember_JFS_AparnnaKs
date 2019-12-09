package com.cg.forestrymanagementapp.DAO;

import com.cg.forestrymanagementapp.bean.CustomerBean;

public interface CustomerDAO {
	boolean addCustomer(CustomerBean customer);
	boolean deleteCustomer(int custId, String custName);
	void customerDetails(int custId, String custName);
	boolean modifyCustomer(int custId,String custName);
	

}
