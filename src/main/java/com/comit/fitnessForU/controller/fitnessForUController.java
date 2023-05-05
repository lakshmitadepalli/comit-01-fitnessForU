package com.comit.fitnessForU.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FitnessForUController {
	private final Logger logger=LoggerFactory.getLogger(this.getClass());
	@GetMapping("/")
	public String landingpage() {
		logger.debug("Landing page");
		return "landingpage";
	}
    @GetMapping("/about")
    public String about() {
    	return "about";
    }
    @GetMapping("/signin")
    public String signin() {
    	return "signin";
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
