package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@RestController
public class GenerateAPI {
	
	@Autowired
	UserRepo ur;
	@GetMapping("/users")
	public List<User> getAllPlayer()
	{
		return ur.findAll();
	}

}
