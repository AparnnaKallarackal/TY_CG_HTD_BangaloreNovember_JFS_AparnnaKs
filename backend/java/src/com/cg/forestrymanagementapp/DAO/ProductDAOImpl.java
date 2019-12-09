package com.cg.forestrymanagementapp.DAO;

import java.util.ArrayList;
import java.util.List;

import com.cg.forestrymanagementapp.bean.CustomerBean;
import com.cg.forestrymanagementapp.bean.ProductBean;

public class ProductDAOImpl implements ProductDAO {
	private List<ProductBean>productbean1=new ArrayList();
	@Override
	public boolean addProduct(ProductBean product) {

		for(ProductBean cb:productbean1)
		{
			if(cb.getId()==product.getId())
				return false;
		}
		productbean1.add(product);
		 return true;
	}

	@Override
	public boolean deleteProduct(int productId) {
		ProductBean bean=null; 
		for(ProductBean cb:productbean1)
		{
			if(cb.getId()==productId)
				bean=cb;
		}
		if(bean!=null)
		{
			productbean1.remove(bean);	
			return true;
		}
		return false;	

		
	}

	@Override
	public boolean modifyProduct(int productId) {

		return false;
	}

}
