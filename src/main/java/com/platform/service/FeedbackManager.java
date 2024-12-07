package com.platform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.model.FeedBack;
import com.platform.repository.FeedbackRepo;

@Service
public class FeedbackManager  implements FeedbackService {

	@Autowired
	FeedbackRepo FR;
	
	@Override
	public String addFeedback(FeedBack FB) {
		try {
			FR.save(FB);
			return "Feedback added successfully";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
