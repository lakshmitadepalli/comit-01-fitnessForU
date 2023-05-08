package com.comit.fitnessForU.controller;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.comit.fitnessForU.bean.UserBean;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FitnessForUController {
	private final Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@ModelAttribute("username")
    public String getUsername(Principal principal) {
    return principal.getName();   }
	
    @GetMapping("/about")
    public String about() {
    	return "about";
    }
   /* @GetMapping("/join")
    public String join() {
    	return "join";
    }*/
    
    
    
    @GetMapping("/")
    public String signin() {
    	return "landingpage";
    }
    
    @GetMapping("/cart")
    public String cart() {
    	return "cart";
    }
    @GetMapping("/member")
    public String member() {
    	return "member";
    }
    @GetMapping("/checkout")
    public String checkout() {
    	return "checkout";
    }
    
    
}
