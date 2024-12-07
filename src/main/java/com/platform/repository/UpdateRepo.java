package com.platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.platform.model.Update;

@Repository
public interface UpdateRepo extends JpaRepository<Update, Long>{

}
