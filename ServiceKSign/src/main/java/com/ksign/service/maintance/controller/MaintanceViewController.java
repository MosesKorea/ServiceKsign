package com.ksign.service.maintance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MaintanceViewController {

	public MaintanceViewController() {
		System.out.println("MaintanceViewController() 생성자###############################");
	}
	
	
	/**
	 * Maintance List View
	 * 고객 생성 및 기족고객 불러오기
	 *  
	**/
	@RequestMapping(value = "/maintanceList", method = RequestMethod.GET)
	public String maintanceList(Model model){
		
		
		return "/maintance/maintance_list_view";
	}
}
