package com.ksign.service.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProjectCreateController {
	
	public ProjectCreateController() {
		System.out.println("ProjectCreateController() 생성자");
	}
	
	/**
	 * Project Cutomer Create and Read
	 * 고객 생성 및 기족고객 불러오기
	 * return : Customer 
	**/
	@RequestMapping(value = "/projectCreate", method = RequestMethod.GET)
	public String CreateProject(Model model) throws Exception{
		
		return "/project/project_create";
	}
	
	/**
	 * Project Issue Create
	 * 프로젝트 이슈 생성
	 * return : Issue 
	**/
	@RequestMapping(value = "/projectIssueCreate", method = RequestMethod.GET)
	public  String CreateIssue(Model model) throws Exception{
		
		return "/project/project_issue_create";
	}
}
