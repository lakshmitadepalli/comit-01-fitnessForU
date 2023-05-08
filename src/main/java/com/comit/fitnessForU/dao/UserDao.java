package com.comit.fitnessForU.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.comit.fitnessForU.bean.UserBean;
import com.comit.fitnessForU.dao.mapper.UserMapper;
import com.comit.fitnessForU.util.Util;

@Repository
public class UserDao {
	List<UserBean> users;
	@Autowired
	JdbcTemplate jdbcTemplate;
     public List<UserBean> listUsers() {
		
		String sql = "SELECT * FROM USER";
		
		return this.jdbcTemplate.query(sql, new UserMapper());
	}
	
	public void joinUser(UserBean user) {
		String sql="INSERT INTO USER(USERNAME,PASSWORD,USER_FNAME,USER_LNAME,DATEOFBIRTH,STATUS,TERMS_ACCEPTANCE)"+"VALUES(?,?,?,?,?,?,?)";
		this.jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),user.getUserFname(),user.getUserLname(),user.getBirth(),"A","A");
		
		
	}
	public UserBean findByUsername(String username) {
		String sql="SELECT * FROM USER WHERE USERNAME=?";
		return this.jdbcTemplate.queryForObject(sql, new UserMapper(),username);
	}

}
