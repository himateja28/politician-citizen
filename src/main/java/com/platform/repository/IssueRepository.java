package com.platform.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.platform.model.Issue;

public interface IssueRepository extends JpaRepository<Issue, Long>{

	@Query("select i from Issue i where i.iid =:id")
	public Issue checkStatus(@Param("id") Long id);
	
	@Query("select i from Issue i where i.status='processing'")
	public List<Issue> getpendingData();
}
