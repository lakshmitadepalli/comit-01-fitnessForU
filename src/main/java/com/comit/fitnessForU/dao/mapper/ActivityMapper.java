package com.comit.fitnessForU.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comit.fitnessForU.bean.ActivityBean;

public class ActivityMapper implements RowMapper<ActivityBean> {

	@Override
	public ActivityBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		ActivityBean activity=new ActivityBean();
		//activity.setActivityId(rs.getInt("ACTIVITY_ID"));
		activity.setActivityName(rs.getString("ACTIVITY_NAME"));
		activity.setDescription(rs.getString("DESCRIPTION"));
		activity.setActivityFee(rs.getDouble("ACTIVITY_FEE"));
		activity.setAvailability(rs.getInt("AVAILABILITY"));
		
		
		
		return activity;
	}

}
