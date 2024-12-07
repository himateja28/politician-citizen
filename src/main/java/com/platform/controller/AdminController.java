package com.platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platform.model.User;
import com.platform.service.UserManager;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:3000/")
public class AdminController {

	@Autowired 
	UserManager UM;
	
	@GetMapping("/users")
	public List<User> getUsers()
	{
		return UM.getData();
	}
	
	@PutMapping("/users/{uid}")
	public String userUpdate(@PathVariable("uid")Long id,@RequestBody User U)
	{
		return UM.updateUser(id, U);
	}
	
	@DeleteMapping("/users/{uid}")
	public boolean deleteUser(@PathVariable("uid")Long id)
	{
		return UM.deleteUser(id);
	}
}
