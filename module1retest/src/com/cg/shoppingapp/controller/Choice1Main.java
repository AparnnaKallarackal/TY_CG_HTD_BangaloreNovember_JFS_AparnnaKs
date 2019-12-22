package com.cg.shoppingapp.controller;

import java.util.List;

import com.cg.shoppingapp.beans.ProductBean;
import com.cg.shoppingapp.factory.ProductFactory;
import com.cg.shoppingapp.services.ProductServices;

public class Choice1Main {
public static void main(String[] args) {
	ProductServices services=ProductFactory.instanceOfProductServices();
	ProductBean bean=new ProductBean();
	List<ProductBean>list=services.showAll();
	if(list!=null) {
		for(ProductBean bean1:list) {
			System.out.println(bean1);
		}
	}
	

}
}
