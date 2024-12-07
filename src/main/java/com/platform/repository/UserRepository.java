package com.platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.platform.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	@Query("select count(u) from User u where u.username=:uname")
	public int validateUser(@Param("uname") String uname);
	
	@Query("select u from User u where u.username=:uname and u.password=:pass")
	public User validateLogin(@Param("uname") String uname,@Param("pass") String pass);
}
