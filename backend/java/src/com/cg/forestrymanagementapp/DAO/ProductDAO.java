package com.cg.forestrymanagementapp.DAO;

import com.cg.forestrymanagementapp.bean.ProductBean;

public interface ProductDAO {
	boolean addProduct(ProductBean product);
	boolean deleteProduct(int productId);
	boolean modifyProduct(int productId);

}
