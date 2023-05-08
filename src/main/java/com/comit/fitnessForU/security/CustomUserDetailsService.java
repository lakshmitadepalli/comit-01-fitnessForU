package com.comit.fitnessForU.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.comit.fitnessForU.bean.UserBean;
import com.comit.fitnessForU.dao.UserDao;
@Service("UserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
	UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserBean user = this.userDao.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("User not found:" + username);
		}
		
		return new CustomUserDetails(user);
	}

}
