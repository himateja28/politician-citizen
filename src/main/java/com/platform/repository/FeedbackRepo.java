package com.platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.platform.model.FeedBack;

@Repository
public interface FeedbackRepo extends JpaRepository<FeedBack, Long>{

}
