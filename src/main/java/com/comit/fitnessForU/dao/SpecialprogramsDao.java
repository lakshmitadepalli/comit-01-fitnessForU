package com.comit.fitnessForU.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.comit.fitnessForU.bean.SpecialProgramsBean;
import com.comit.fitnessForU.dao.mapper.SpecialprogramMapper;

@Repository
public class SpecialprogramsDao {
	List<SpecialProgramsBean> special;
	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<SpecialProgramsBean> listSpecial(){
		
		String sql="SELECT ACTIVITY_NAME SPECIAL_NAME,DESCRIPTION,ACTIVITY_FEE SPECIAL_FEE, AVAILABILITY FROM ACTIVITIES WHERE TYPE='SPECIAL'";
		return jdbcTemplate.query(sql,new SpecialprogramMapper());
	}
	

}
