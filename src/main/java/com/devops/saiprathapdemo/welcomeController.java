package com.devops.saiprathapdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class welcomeController {
	
	@GetMapping("/welcome")
	public String welcome(Model model) {
		model.addAttribute("message","Hello world!");
		return "welcome";
	}
	
	

}
