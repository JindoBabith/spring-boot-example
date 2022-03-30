package com.jindo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jindo.demo.entity.User;
import com.jindo.demo.service.UserService;
@RestController
@RequestMapping("/User")
public class UserContoller {
	@Autowired
    UserService urService;
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public List<User> readUsers() {
	    return urService.getUsers();
	}
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public User createEmployee(@RequestBody User ur) {
	    return urService.createUser(ur);
	}


}
