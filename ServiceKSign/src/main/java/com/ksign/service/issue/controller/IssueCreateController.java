package com.ksign.service.issue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class IssueCreateController {

	public IssueCreateController() {
		System.out.println("IssueCreateController() 생성자");
	}
	
	
	@RequestMapping(value="/issueCreate",method=RequestMethod.GET)
	public String issueList(Model model){
		return "issue/issue_create_view";
	}
}
