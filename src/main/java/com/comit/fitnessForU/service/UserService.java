package com.comit.fitnessForU.service;


import java.sql.Date;
import java.util.List;

import com.comit.fitnessForU.bean.UserBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comit.fitnessForU.bean.UserBean;
import com.comit.fitnessForU.dao.UserDao;
import com.comit.fitnessForU.util.Util;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	public List<UserBean> listUsers() {

		List<UserBean> users = this.userDao.listUsers();
		
		return users;
	}

	
	public void joinUser(UserBean user) {
		this.validateUser(user);
		this.userDao.joinUser(user);
		
	}
	public void validateUser(UserBean user) {
		if (user.getUserFname().isEmpty() ||
				user.getUserLname().isEmpty() ||
				user.getUsername().isEmpty()) {
				throw new RuntimeException("Invalid User Data: " + user);
			}		

		
	    
	    
	}
	 


	}
	

