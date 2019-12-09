package com.cg.forestrymanagementapp.DAO;

import java.util.ArrayList;
import java.util.List;

import com.cg.forestrymanagementapp.bean.ContractBean;
import com.cg.forestrymanagementapp.bean.CustomerBean;

public class ContractDAOImpl implements ContractDAO {
	private List<ContractBean>contractbean1=new ArrayList();

	@Override
	public boolean addContractor(ContractBean contract) {
		for(ContractBean cb:contractbean1)
		{
			if(contract.getContractNo()==cb.getContractNo())
			{
				if(contract.getCustomerId()==cb.getCustomerId())
					return false;
			}
		}
		contractbean1.add(contract);
		return true;
	}

	@Override
	public boolean deleteContractor(int contractNo, int customerId) {
		ContractBean bean=null; 
		for(ContractBean cb:contractbean1)
		{
			if(cb.getContractNo()==contractNo && cb.getCustomerId()==customerId)
				bean=cb;
		}
		if(bean!=null)
		{
			contractbean1.remove(bean);	
			return true;
		}
		return false;
	}
	

}
