package com.comit.fitnessForU.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.comit.fitnessForU.bean.ActivityBean;
import com.comit.fitnessForU.dao.mapper.ActivityMapper;



@Repository
public class ActivityDao {
	List<ActivityBean> activities; 
	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<ActivityBean> listActivities(){
		String sql="SELECT ACTIVITY_NAME,DESCRIPTION,ACTIVITY_FEE, AVAILABILITY FROM ACTIVITIES WHERE TYPE='REGULAR'";
		return jdbcTemplate.query(sql, new ActivityMapper());
	}
	
	
	

}
