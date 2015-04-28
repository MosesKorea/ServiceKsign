package com.ksign.service.weekreport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class WeekreportCreateController {

	public WeekreportCreateController() {
		System.out.println("WeekreportListController() 생성자 &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	}
	
	/**
	 * week Create
	 * 일정 리스트
	 *  
	**/
	@RequestMapping(value = "/weekCreate", method = RequestMethod.GET)
	public String customerListView(Model model)
	{
		return "/week/week_create";
	}
}
