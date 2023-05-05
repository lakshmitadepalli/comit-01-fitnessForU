package com.comit.fitnessForU.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.comit.fitnessForU.bean.UserBean;
import com.comit.fitnessForU.service.UserService;
import com.comit.fitnessForU.util.Util;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	
	@GetMapping("/join")
    public String showjoin() {
    	return "join";
    }
	
	@GetMapping("/account")
	public String showaccount() {
		return "account";
	}
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
