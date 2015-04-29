package com.ksign.service.issue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IssueViewController {

	
	public IssueViewController() {
		System.out.println("IssueViewController() 생성자");
	}
	
	
	/**
	 * 이슈 뷰 메소드
	 * @param model
	 * @return 주소
	 */
	@RequestMapping(value = "/issueView", method = RequestMethod.GET)
	public String maintanceIssueList(Model model){
		return "issue/issue_view";
	}
}
