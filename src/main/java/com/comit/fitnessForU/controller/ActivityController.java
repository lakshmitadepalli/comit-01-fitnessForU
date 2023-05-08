package com.comit.fitnessForU.controller;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.comit.fitnessForU.bean.ActivityBean;
import com.comit.fitnessForU.service.ActivityService;

@Controller
public class ActivityController {
	private final Logger logger=LoggerFactory.getLogger(this.getClass());
	@Autowired
	ActivityService activityService;
	@ModelAttribute("username")
    public String getUsername(Principal principal) {
    return principal.getName();   }
	
	@GetMapping("/activities")
	public ModelAndView activities() {
		List<ActivityBean> activities = this.activityService.listActivities();
		logger.debug("Listing activities");
		
		
		return new ModelAndView("activities","activities",activities);
	}
	
	
}
