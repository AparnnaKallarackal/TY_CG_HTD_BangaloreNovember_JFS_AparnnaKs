package com.cg.forestrymanagementapp.factory;

import com.cg.forestrymanagementapp.DAO.ProductDAO;
import com.cg.forestrymanagementapp.DAO.ProductDAOImpl;

public class ProductFactory {
private ProductFactory() {
		
	}
	public static ProductDAO instanceOfProductDAOImpl() {
		ProductDAO productDao=new ProductDAOImpl();
		return productDao;
	}
}
