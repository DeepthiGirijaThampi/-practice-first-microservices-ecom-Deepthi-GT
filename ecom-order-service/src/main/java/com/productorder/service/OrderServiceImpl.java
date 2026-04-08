package com.productorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productorder.feign.IProductServiceFeignClient;
import com.productorder.model.Product;

@Service
public class OrderServiceImpl implements IOrderService{
	
	@Autowired
	private IProductServiceFeignClient feignClient;

	@Override
	public String placeOrder(int productId) {
		// TODO Auto-generated method stub
		Product product = feignClient.getById(productId);
		if(product!=null) {
			return "Order placed succesfully for " + product.getProductName();
		}
		return "Product with this id is not available";
	}

	@Override
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		return feignClient.getAllProducts();
	}
	

}
