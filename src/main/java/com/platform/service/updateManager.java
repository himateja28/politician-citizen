package com.platform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.model.Update;
import com.platform.repository.UpdateRepo;

@Service
public class updateManager {

	@Autowired
	UpdateRepo UR;
	
	public String addUpdate(Update U)
	{
		try {
			UR.save(U);
			return "Update sent successfully";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	public List<Update> getData()
	{
		return UR.findAll();
	}
}
