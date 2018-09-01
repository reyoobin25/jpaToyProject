package com.apress.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apress.spring.domain.Product;
import com.apress.spring.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public void save(Product product) {
		productRepository.save(product);
	}
	
	public Product findByProductId(Long id) {
		return productRepository.getOne(id);
	}
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}

	

}
