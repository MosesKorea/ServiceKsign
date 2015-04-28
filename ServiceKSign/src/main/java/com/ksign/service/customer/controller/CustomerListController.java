package com.ksign.service.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerListController {

	public CustomerListController() {
		System.out.println("CustomerListController()$$$$$$$$$$$$$$$$$$$$$$$$");
	}
	
	/**
	 * Maintance List View
	 * 고객 생성 및 기족고객 불러오기
	 *  
	**/
	@RequestMapping(value = "/customerList", method = RequestMethod.GET)
	public String customerListView(Model model)
	{
		return "/project/customer/customer_list_view";
	}
}
