package com.productorder.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productorder.service.IOrderService;
import com.productorder.model.Product;
import java.util.List;

@RestController
@RequestMapping("/order-service/v1")
public class OrderController {
	
	@Autowired
	private IOrderService orderService;
	
	@GetMapping("/orders/place-order/{productId}")
	String placeOrder(@PathVariable int productId) {
		return orderService.placeOrder(productId);
	}
	
	@GetMapping("/orders/view-products")
	List<Product> viewAllProducts(){
		return orderService.viewAllProducts();
	}
	
}
