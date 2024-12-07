package com.platform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.model.Discussion;
import com.platform.repository.DisussionRepo;

@Service
public class DiscussionManager implements DiscussionSerice {

	@Autowired
	DisussionRepo DR;
	
	@Override
	public String addDiscussion(Discussion D) {
		try {
			DR.save(D);
			return "new Discussion added";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
