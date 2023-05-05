package com.comit.fitnessForU.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comit.fitnessForU.bean.SpecialProgramsBean;
import com.comit.fitnessForU.dao.SpecialprogramsDao;

@Service
public class SpecialprogramsService {
	@Autowired
	SpecialprogramsDao specialDao;
	public List<SpecialProgramsBean> listSpecial(){
		List<SpecialProgramsBean> special=this.specialDao.listSpecial();
		return special;
	}

}
