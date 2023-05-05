package com.comit.fitnessForU.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comit.fitnessForU.bean.UserBean;

public class UserMapper implements RowMapper<UserBean> {

	@Override
	public UserBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserBean user = new UserBean();
		user.setUserId(rs.getInt("USER_ID"));
		user.setUserFname(rs.getString("USER_FNAME"));
		user.setUserLname(rs.getString("USER_LNAME"));
		user.setPassword(rs.getString("PASSWORD"));
		user.setBirth(rs.getDate("DATEOFBIRTH"));
	    user.setStatus(rs.getString("STATUS"));
	    user.setTermsAcceptance("TERMS_ACCEPTANCE");
		return user;
	}

}
