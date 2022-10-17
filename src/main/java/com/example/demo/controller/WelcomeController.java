package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@RestController
public class WelcomeController {
	
	@Autowired
	UserRepo ur;
	
	@RequestMapping("hi")
	public String home()
	{
		return "Hello Welcome";
	}
	
	@RequestMapping("")
	public ModelAndView m2()
	{
		return new ModelAndView("index");
	}
	
	@RequestMapping("loginuser")
	public ModelAndView login()
	{
		return new ModelAndView("login");
	}
	
	@RequestMapping("registeruser")
	public ModelAndView register()
	{
		return new ModelAndView("register");
	}
	
	@RequestMapping(value="insertusers",method=RequestMethod.POST)
	public ModelAndView insertuser(HttpServletRequest req)
	{
		ModelAndView mv = null;
		int Id = Integer.parseInt(req.getParameter("id"));
		String Name = req.getParameter("username");
		String Gender = req.getParameter("gender");
		String Location = req.getParameter("location");
		String Email = req.getParameter("email");
		String Password = req.getParameter("password");
		System.out.println(Name+" "+Gender+" "+Location+" "+Email+" "+Password);
		
		User us = new User(Id,Name,Gender,Location,Email,Password);
		ur.save(us);
		return mv;
		
	}
}
