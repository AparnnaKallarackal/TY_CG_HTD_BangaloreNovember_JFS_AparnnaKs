package com.cg.forestrymanagementapp.DAO;
import java.util.*;

import com.cg.forestrymanagementapp.bean.CustomerBean;

public class CustomerDAOImpl implements CustomerDAO {
	private List<CustomerBean>customerbean1=new ArrayList();
	Scanner scn=new Scanner(System.in);
	

	@Override
	public boolean addCustomer(CustomerBean customer) {
		for(CustomerBean cb:customerbean1)
		{
			if(cb.getCustId()==customer.getCustId())
				return false;
		}
		customerbean1.add(customer);
		return true;
	}

	@Override
	public boolean deleteCustomer(int custId, String custName) {
		CustomerBean bean=null; 
		for(CustomerBean cb:customerbean1)
		{
			if(cb.getCustId()==custId)
				bean=cb;
		}
		if(bean!=null)
		{
			customerbean1.remove(bean);	
			return true;
		}
			return false;
	}

	@Override
	public void customerDetails(int custId, String custName) {
		for(CustomerBean cb:customerbean1)
		{
			if(cb.getCustId()==custId)
			{
				System.out.println("customer id "+cb.getCustId());
				System.out.println("customer name "+cb.getCustName());
				System.out.println("customer address 1 "+cb.getCustAddress1());
				System.out.println("customer address 2 "+cb.getCustAddress2());
				System.out.println("customer email "+cb.getCustEmail());
				System.out.println("customer town "+cb.getCustTown());
				System.out.println("phone number "+cb.getCustPhNum());
				return;
			}
		}
		System.out.println("id wrong");
		
		
	}

	@Override
	public boolean modifyCustomer(int custId, String custName) {
		for(CustomerBean cb:customerbean1)
		{
			if(cb.getCustId()==custId)
			{	System.out.println();
				System.out.println();
				System.out.println("************");
				System.out.print("enter new name ");
				cb.setCustName(scn.next());
				
				System.out.println("enter new address 1 ");
				cb.setCustAddress1(scn.next());
				
				System.out.println("enter new address 2 ");
				cb.setCustAddress2(scn.next());
				
				System.out.println("enter new mail");
				cb.setCustEmail(scn.next());
				
				System.out.println("enter new town");
				cb.setCustTown(scn.next());
				
				System.out.println("enter phone number ");
				cb.setCustPhNum(scn.nextLong());
				System.out.println();
				System.out.println();
				System.out.println("************");
				System.out.println();
				System.out.println();
				
			
				
				return true;
			}
			}
			return false;
	}
	
	}


