package com.apress.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apress.spring.domain.Product;
import com.apress.spring.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("")
	public String productIndex(Model model) {
		
		List<Product> list = productService.findAll();
		
		model.addAttribute("list",list);
		
		return "product";
	}
}
