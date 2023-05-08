package com.comit.fitnessForU.controller;

import java.security.Principal;
import java.util.Date;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.comit.fitnessForU.bean.UserBean;

import com.comit.fitnessForU.service.UserService;
import com.comit.fitnessForU.util.Util;


import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {
	private final Logger logger=LoggerFactory.getLogger(this.getClass());
	@Autowired
	UserService userService;
	
	
	
	
/*@ModelAttribute("username")
    public String getUsername(Principal principal) {
    return principal.getName();   }*/
	
@GetMapping("/join")
public String join() {
	return "join";
}
	
	
	
	
	
	/*@GetMapping("/")
    public String signin() {
    	return "landingpage";
    }*/
	
	
	
	
	/*@GetMapping("/")
	public ModelAndView home(Principal principal) {
	   
	    
	   
	    List<UserBean> user = this.userService.listUsers();
	     
		return new ModelAndView("landingpage","user",user);
	}*/
	

	
	
	
	
	
	/*@GetMapping("/join")
    public String showjoin() {
		
    	return "join";
    }*/
	
	
@PostMapping("/join")
public String joinUser(HttpServletRequest req) {
		String first=req.getParameter("first");
		String last=req.getParameter("last");
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String birth=req.getParameter("birth");

		UserBean user=this.joinUserBean(first, last, username, password, birth);
		this.userService.joinUser(user);
		return  "redirect:/landingpage";

}

	private UserBean joinUserBean(String first,String last,String username,String password,String birth) {
		UserBean user=new UserBean (0,first,last,username,password,Util.parseDate(birth),""," ");
	 return user;

	}
}
