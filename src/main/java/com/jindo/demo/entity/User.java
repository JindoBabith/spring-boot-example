package com.jindo.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id") 
	private Integer id;
	
	@Column(name="is_active")
	private String isActive;
	
	@Column(name="password")
	private String password;
	
	@Column(name="user_type")
	private String userType;
	
	@Column(name="username")
	private String username;

}
