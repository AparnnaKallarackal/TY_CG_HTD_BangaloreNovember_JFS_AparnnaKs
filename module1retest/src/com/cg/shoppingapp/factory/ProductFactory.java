package com.cg.shoppingapp.factory;

import com.cg.shoppingapp.dao.ProductDao;
import com.cg.shoppingapp.dao.ProductDaoImpl;
import com.cg.shoppingapp.services.ProductServices;
import com.cg.shoppingapp.services.ProductServicesImpl;

public class ProductFactory {

	private ProductFactory() {
		
	}
	public static ProductDao instanceOfProductDaoImpl() {
		ProductDao dao=new ProductDaoImpl();
		return dao;
	}
	public static ProductServices instanceOfProductServices() {
		ProductServices services=new ProductServicesImpl();
		return services;
	}
}
