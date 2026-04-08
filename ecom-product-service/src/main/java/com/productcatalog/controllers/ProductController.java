package com.productcatalog.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productcatalog.model.Product;
import com.productcatalog.service.IProductService;

@RestController
@RequestMapping("/catalog-service/v1")
public class ProductController {
	
	//autowire service layer
	@Autowired
	private IProductService productService;
	
	//http://localhost:8081/catalog-service/v1/products
	
	@GetMapping("/products")
	List<Product> viewProducts(){
		return productService.getAll();
	}
	
	@GetMapping("/products/productId/{productId}")
	Product viewById(@PathVariable int productId) {
		return productService.getById(productId);
	}
	
	@GetMapping("products/category/{cat}")
	List<Product> viewByCategory(@PathVariable("cat") String category){
		return productService.getByCategory(category);
	}

}
