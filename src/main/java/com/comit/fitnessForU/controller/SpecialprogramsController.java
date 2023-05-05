package com.comit.fitnessForU.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.comit.fitnessForU.bean.SpecialProgramsBean;
import com.comit.fitnessForU.service.SpecialprogramsService;

@Controller
public class SpecialprogramsController {
	private final Logger logger= LoggerFactory.getLogger(this.getClass());
	@Autowired
	SpecialprogramsService specialService;
	@GetMapping("/specialprograms")
	public ModelAndView specialprograms() {
		logger.debug("Listing specialprograms");
		List<SpecialProgramsBean> special=this.specialService.listSpecial();
		
		return  new ModelAndView("specialprograms","special",special);
	}
	
	
	
	
}



