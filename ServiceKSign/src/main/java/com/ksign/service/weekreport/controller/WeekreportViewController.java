package com.ksign.service.weekreport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WeekreportViewController {

	public WeekreportViewController() {
		System.out.println("&&&&&&&&&&&&&&&&&&&&&& WeekreportViewController() 생성자");
	}
	@RequestMapping(value="/weekView", method= RequestMethod.GET)
	public String weekreportView(Model model){
		return "week/week_view";
	}
}
