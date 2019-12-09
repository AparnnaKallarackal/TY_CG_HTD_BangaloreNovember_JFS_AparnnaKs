package com.cg.forestrymanagementapp.DAO;

import com.cg.forestrymanagementapp.bean.ContractBean;

public interface ContractDAO {
	boolean addContractor(ContractBean contract);
	boolean deleteContractor(int contractNo,int customerId);
}
