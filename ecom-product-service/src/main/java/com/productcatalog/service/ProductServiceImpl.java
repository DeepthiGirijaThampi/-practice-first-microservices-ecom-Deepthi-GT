package com.productcatalog.service;

import java.util.List;

import com.productcatalog.model.Product;
import com.productcatalog.util.ProductRepo;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService{
	
	
	//autowire ProductRepo
	private ProductRepo repo;
	
	//autowiring happens automatically
	public ProductServiceImpl(ProductRepo repo) {
		super();
		this.repo = repo;
	}


	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return repo.showProducts();
	}

	@Override
	public Product getById(int productId) {
		List<Product> products = repo.showProducts();
		for (Product product : products) {
			if(product.getProductId()==productId)
				return product;
		}
		return null;
		
		  
//		Optional<Product> productopt = products.stream()
//				.filter(product->product.getProductId()==productId)
//				.findFirst();
//		if(productopt.isPresent())
//			return productopt.get();
//		else
//			return null;
	}

	@Override
	public List<Product> getByCategory(String category) {
		List<Product> products = repo.showProducts();
		return products.stream()
				.filter(product->product.getCategory().equals(category))
				.toList();
	}

}
