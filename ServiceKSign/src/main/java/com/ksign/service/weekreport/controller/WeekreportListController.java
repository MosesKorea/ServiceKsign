	package com.ksign.service.weekreport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class WeekreportListController {

	public WeekreportListController() {
		System.out.println("WeekreportListController() 생성자 &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	}
	
	/**
	 * week List View
	 * 주간 일정 리스트
	 *  
	**/
	@RequestMapping(value = "/weekList", method = RequestMethod.GET)
	public String customerListView(Model model)
	{
		return "week/week_list_view";
	}
	
	
	/**
	 * week Issue List
	 * 비상주프로젝트 일정 이슈 리스트
	 *  
	**/
	@RequestMapping(value = "/weekIssueList", method = RequestMethod.GET)
	public String customerIssueListView(Model model)
	{
		return "week/week_issue_list_view";
	}
}
