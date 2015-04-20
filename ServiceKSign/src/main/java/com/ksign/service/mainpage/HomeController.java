package com.ksign.service.mainpage;

import java.util.Locale;
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
	public String home(Locale locale, Model model){
			
			
		return "index";
	}
	
	

}
