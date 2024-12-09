package com.platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platform.model.Update;
import com.platform.service.updateManager;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/update")
@CrossOrigin(origins = "https://socio-connect-chi.vercel.app/")
public class UpdateCtroller {
	
	@Autowired
	updateManager UM;

	@PostMapping("/add")
	public String addUpdate(@RequestBody Update u) {
		return UM.addUpdate(u);
	}
	
	@GetMapping("/view")
	public List<Update> getData()
	{
		return UM.getData();
	}
}
