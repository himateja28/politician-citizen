package com.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platform.model.Discussion;
import com.platform.service.DiscussionManager;

@RestController
@RequestMapping("/diss")
public class DiscussionController {
	
	@Autowired
	DiscussionManager DM;
	
	@PostMapping("/add")
	public ResponseEntity<String> addDisscussion(@RequestBody Discussion D)
	{
		String message = DM.addDiscussion(D);
		 return new ResponseEntity<String>(message,HttpStatus.OK);
	}
}
