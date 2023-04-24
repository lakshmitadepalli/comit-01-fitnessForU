package com.comit.fitnessForU.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class fitnessForUController {
	@GetMapping("/")
	public String landingpage() {
		return "landingpage";
	}
    @GetMapping("/about")
    public String about() {
    	return "about";
    }
}
