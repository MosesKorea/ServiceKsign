package com.ksign.service.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProjectListController {
	
	public ProjectListController() {
		// TODO Auto-generated constructor stub
		System.out.println("### ProjectListController()생성자");
	}
	
	
	@RequestMapping(value = "/projectList", method = RequestMethod.GET)
	public String projectlist(Model model) throws Exception{
			
			
		return "project/project_list_view";
	}
	
	@RequestMapping(value = "/projectIssueUpdate", method = RequestMethod.GET)
	public String projectIssueList(Model model) throws Exception{
			
			
		return "project/project_issue_list_view";
	}
}
