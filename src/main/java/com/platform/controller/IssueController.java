package com.platform.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.platform.model.Issue;
import com.platform.service.IssueService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/issue")
@CrossOrigin(origins = "http://localhost:3000/")
public class IssueController {
	@Autowired
	IssueService IS;
	@PostMapping("/add")
	public String addIssue(@RequestBody Issue i)  {
	    return IS.addIssue(i);
	}

	@GetMapping("/delete/{id}")
	public String deletData(@PathVariable("id") Long iid)
	{
		return IS.deleteIssue(iid);
	}
	
	@GetMapping("/check/{id}")
	public Issue checkStatus(@PathVariable("id") Long cid)
	{
		return IS.checkStatus(cid);
	}
	
	@GetMapping("/all")
	public List<Issue> getData()
	{
		return IS.getData();
	}
	
	@PostMapping("/respond")
	public Long sendResponse(@RequestParam("id") Long iid,@RequestParam("message") String imessage)
	{
		System.out.println(iid+""+imessage);
		Issue I = IS.respond(iid, imessage);
		return I.iid;
	}
}
