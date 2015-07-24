package com.kisgn.service;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



	@Controller
public class HomeController {
		
		
	public HomeController() {
		System.out.println("### HomeController()생성자");
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home(Model model){

		return "index"; 

	}
	
	

}
