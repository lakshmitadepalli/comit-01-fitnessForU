package com.comit.fitnessForU.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comit.fitnessForU.bean.SpecialProgramsBean;

public class SpecialprogramMapper implements RowMapper<SpecialProgramsBean> {

	@Override
	public SpecialProgramsBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		SpecialProgramsBean special=new SpecialProgramsBean();
		
		
		special.setSpecialName(rs.getString("SPECIAL_NAME"));
		special.setDescription(rs.getString("DESCRIPTION"));
		special.setSpecialFee(rs.getDouble("SPECIAL_FEE"));
		special.setAvailability(rs.getInt("AVAILABILITY"));
		return special;
	}

}
