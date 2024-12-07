package com.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platform.model.FeedBack;
import com.platform.model.User;
import com.platform.service.FeedbackManager;
import com.platform.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000/")
public class UserController {

	@Autowired
	UserService UM;
	
	@Autowired
	FeedbackManager FM;
	
	@PostMapping("/signup")
	public String addUser(@RequestBody User u)
	{
		return UM.signup(u);
	}
	
	@GetMapping("/login/{user}/{pass}")
	public User login(@PathVariable("user")String username,@PathVariable("pass")String password)
	{
		System.out.println(username + ""+password);
		return UM.login(username,password);
	}
	
	@PostMapping("/feedback")
	public String addFeedback(@RequestBody FeedBack FB)
	{
		return FM.addFeedback(FB);
	}
}
