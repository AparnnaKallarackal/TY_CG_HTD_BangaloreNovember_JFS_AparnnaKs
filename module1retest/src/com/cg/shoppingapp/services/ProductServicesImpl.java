package com.cg.shoppingapp.services;

import java.util.List;

import com.cg.shoppingapp.beans.ProductBean;
import com.cg.shoppingapp.dao.ProductDao;
import com.cg.shoppingapp.dao.ProductDaoImpl;

public class ProductServicesImpl implements ProductServices{
	ProductDaoImpl dao=new ProductDaoImpl();

	@Override
	public List<ProductBean> showAll() {
		
		return dao.showAll();
	}

	@Override
	public boolean search(ProductBean bean) {
		
		return dao.search(bean);
	}

	@Override
	public void buyPro() {
		
		
	}
	

}
