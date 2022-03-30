package com.jindo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jindo.demo.entity.User;
import com.jindo.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	//Create
	public User createUser(User user) {
		return userRepository.save(user);
		
	}
	//read
	
	public List<User>getUsers(){
		return userRepository.findAll(); 
		
	}
	
	//delete
	public void  deleteUser(Integer uid) {
	 userRepository.deleteById(uid);
		
	}
//	
//	// UPDATE
//	public User updateUser(Integer uid, User users) {
//	        User user = userRepository.findById(uid).get();
	        
	                                   
	//}
	
	

}




