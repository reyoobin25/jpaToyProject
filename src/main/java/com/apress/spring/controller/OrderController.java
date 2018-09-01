package com.apress.spring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apress.spring.domain.BuyProduct;
import com.apress.spring.domain.Product;
import com.apress.spring.domain.User;
import com.apress.spring.service.BuyProductService;
import com.apress.spring.service.ProductService;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private ProductService productService;
	@Autowired
	private BuyProductService buyProductService;

	@RequestMapping("/{productId}")
	public String showOrder(@PathVariable Long productId, Model model, HttpSession session) {
		if(session.getAttribute("login")==null||session.getAttribute("login")=="") {
			return "redirect:/login/form";
		}
		Product product = productService.findByProductId(productId);
		model.addAttribute("order", product);
		return "order";
	}
	
	@RequestMapping("/buy/{id}")
	public String buy(@PathVariable Long id, HttpSession session) {
		
		BuyProduct buyProduct = new BuyProduct();
		
		Product product = productService.findByProductId(id);
		buyProduct.setProduct(product);
		User user = (User)session.getAttribute("login");
		buyProduct.setUser(user);
		
		buyProductService.save(buyProduct);
		
		return "redirect:/";
	}

}
