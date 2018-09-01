package com.apress.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apress.spring.domain.BuyProduct;
import com.apress.spring.repository.BuyProductRepository;

@Service
public class BuyProductService {
	@Autowired
	private BuyProductRepository buyProductRepository;
	
	
	public void save(BuyProduct buyProduct) {
		buyProductRepository.save(buyProduct);
	}
}
