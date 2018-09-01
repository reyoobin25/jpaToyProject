package com.apress.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apress.spring.domain.User;
import com.apress.spring.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public void save(User user) {
		userRepository.save(user);
	}
	
	public User findByUserId(String userId) {
		return userRepository.findByUserId(userId);
	}
	
	
}
