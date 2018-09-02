package com.apress.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apress.spring.domain.User;
import com.apress.spring.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("")
	public String index() {
		return "joinform";
	}

	//회원가입은 post방식으로 넘기고 가입이 끝났으면 index페이지로 넘어가게 한다.
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(User user) {
		System.out.println(user.toString());
		userService.save(user);
		return "index";
	}
}
