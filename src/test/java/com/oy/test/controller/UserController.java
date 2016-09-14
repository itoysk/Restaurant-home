package com.oy.test.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oy.test.service.UserService;

@Controller
@RequestMapping("/h")
public class UserController {

	@Resource
	private UserService userService;
	
	
	@RequestMapping("/user")
	public void printf(){
		System.out.println(userService.getUserById(1).getUsername());
		System.out.println(userService.getUserById(1).getPassword());
	}
}
