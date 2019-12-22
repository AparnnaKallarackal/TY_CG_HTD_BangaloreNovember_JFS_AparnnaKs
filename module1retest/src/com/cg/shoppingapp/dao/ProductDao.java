package com.cg.shoppingapp.dao;

import java.util.List;

import com.cg.shoppingapp.beans.ProductBean;

public interface ProductDao {
	public List<ProductBean> showAll();
	public boolean search(ProductBean bean);
	public ProductBean buyPro();

}
