package com.ksign.service.issue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IssueListController {

	public IssueListController() {
		System.out.println("IssueListController() 생성자");
	}
	
	@RequestMapping(value="/issueList",method=RequestMethod.GET)
	public String issueList(Model model){
		return "issue/issue_list_view";
	}
	
	
}
