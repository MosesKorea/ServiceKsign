package com.ksign.service.weekreport.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class WeekreportUpdateController {

	
	
	/**
	 * week Issue Create
	 * 비상주프로젝트 일정 이슈 생성
	 *  
	**/
	@RequestMapping(value = "/weekIssueUpdate", method = RequestMethod.GET)
	public String customerIssueListView(Model model)
	{
		return "week/week_issue_create";
	}
}
