package com.platform.service;


import java.util.List;

import com.platform.model.Issue;

public interface IssueService {

	public String addIssue(Issue i);
	public Issue updateIssue(Long id, Issue updatedIssue);
	public String deleteIssue(Long id);
	public Issue checkStatus(Long id);
	public List<Issue> getData();
	public Issue respond(Long id,String response);
}
