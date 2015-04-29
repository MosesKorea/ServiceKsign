package com.ksign.service.maintance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MaintanceListController {

	
	public MaintanceListController() {
		System.out.println("############################ MaintanceListController() 생성자");
	}
	
	
		
	@RequestMapping(value = "/maintanceIssueUpdate", method = RequestMethod.GET)
	public String maintanceIssueList(Model model){
		return "maintance/maintance_issue_list_view";
	}
}
	