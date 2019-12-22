package com.cg.shoppingapp.services;

import java.util.List;

import com.cg.shoppingapp.beans.ProductBean;

public interface ProductServices {
	public List<ProductBean> showAll();
	public boolean search(ProductBean bean);
	public void buyPro();

}
