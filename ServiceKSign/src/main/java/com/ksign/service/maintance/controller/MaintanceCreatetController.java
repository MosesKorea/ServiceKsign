package com.ksign.service.maintance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MaintanceCreatetController {

	
	public MaintanceCreatetController() {
		System.out.println("####################### MaintanceCreatetController() 생성자");
	}
	
	
	@RequestMapping(value = "/maintanceCreate", method = RequestMethod.GET)
	public String maintanceCreatet(Model model) throws Exception{
		
		return "maintance/maintance_create";
	}
	
	@RequestMapping(value = "/maintanceIssueCreate", method = RequestMethod.GET)
	public String maintanceIssueCreatet(Model model) throws Exception{
		
		return "maintance/maintance_issue_create";
	}
	
}
