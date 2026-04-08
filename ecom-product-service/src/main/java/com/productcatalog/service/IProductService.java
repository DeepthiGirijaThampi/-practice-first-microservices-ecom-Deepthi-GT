package com.productcatalog.service;

import java.util.List;

import com.productcatalog.model.Product;


public interface IProductService {
	
	List<Product> getAll(); //return list of products
	
	Product getById(int productId); //returns a product
	
	List<Product> getByCategory(String category); //return list of products
	

}
