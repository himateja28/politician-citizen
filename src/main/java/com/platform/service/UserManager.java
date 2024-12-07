package com.platform.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.model.User;
import com.platform.repository.UserRepository;

@Service
public class UserManager implements UserService{

	@Autowired
	UserRepository UR;
	
	@Override
	public String signup(User U)
	{
		try {
			if(UR.validateUser(U.username)>0)
					throw new Exception("Username already exists..");
			UR.save(U);
			return "1";
		} catch (Exception e) {
			return e.getMessage();
		}
		
	}
	
	@Override
	public User login(String username, String password) {
	    try {
	        // Call validateLogin once and reuse the result
	        User u = UR.validateLogin(username, password);
	        
	        // Check if the user object is not null and has a role
	        if (u != null && u.getRole() != null) {
	            return u;
	        } else {
	            // Throw an exception if role is not found
	            throw new Exception("401 Unauthorized: Role not found for user " + username);
	        }
	    } catch (Exception e) {
	        // Optionally log the exception
	        System.err.println("Login failed for user " + username + ": " + e.getMessage());
	        return null;
	    }
	}

	
	public List<User> getData()
	{
		return UR.findAll();
	}
	
	public String updateUser(Long id,User userDetails)
	{
		try {
			
			   Optional<User> optionalUser = UR.findById(id);

		        if (optionalUser.isPresent()) {
		            User user = optionalUser.get();
		            user.setUsername(userDetails.getUsername());
		            user.setPassword(userDetails.getPassword());
		            user.setFullname(userDetails.getFullname());
		            user.setDob(userDetails.getDob());
		            user.setAddress(userDetails.getAddress());
		            user.setMobileno(userDetails.getMobileno());
		            user.setRole(userDetails.getRole());

		             UR.save(user);
		}
		        return "Updated successfully";
			
		} catch (Exception e) {
			return e.getMessage();
		}
		
}
	public boolean deleteUser(Long uid) {
        Optional<User> optionalUser = UR.findById(uid);

        if (optionalUser.isPresent()) {
            UR.deleteById(uid); 
            return true;
        } else {
            return false; 
        }
    }

}
