package com.apress.spring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apress.spring.domain.User;
import com.apress.spring.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/login/form")
	public String form() {
		return "login";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("login"); //로그아웃 할 때 세션값 지워줄라고
		return "redirect:/"; //리다이렉트되서 index페이지를 보여준다.
	}
	
	@RequestMapping("/login")
	public String login(String userId, String password,HttpSession session) {
		User user = userService.findByUserId(userId);
		
		if(user.getPassword().equals(password)) {
			session.setAttribute("login", user);
			return "redirect:/";
		}
		
		return "redirect:/login/form";
	}
}
