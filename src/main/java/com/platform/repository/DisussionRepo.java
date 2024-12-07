package com.platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.platform.model.Discussion;

@Repository
public interface DisussionRepo extends JpaRepository<Discussion, Long>{

}
