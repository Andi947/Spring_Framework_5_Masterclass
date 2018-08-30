package com.company.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.service.demo.GenericWelcomeService;
//import com.company.service.demo.WelcomeService;

@Controller
public class WelcomeController {
	
	@Autowired
	private GenericWelcomeService welcomeService;
	
	@RequestMapping("/")
	// http://localhost:8080/spring-mvc-demo-1/ -> this url will go directly into method
	public String doWelcome(Model model) {
		
		//1. Retrieving the processed data
//		WelcomeService welcomeService = new WelcomeService();
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Andrea Naylor");
		
		//2. Add data to the model 
		model.addAttribute("myWelcomeMessage", welcomeMessage);
		
		//3. return the logical view name
		return "welcomeNew";  ///WEB-INF/views/{name}.jsp
	}

}
