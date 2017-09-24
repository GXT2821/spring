package com.sut.gt.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sut.gt.annotation.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void add() {
		System.out.println("UserService add...");
		userRepository.save();
	}

}
