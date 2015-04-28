package com.ksign.service.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerCreateController {

	public CustomerCreateController() {
		System.out.println("CustomerCreateController()$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
	/**
	 * customer create View
	 * 고객 생성 
	 *  
	**/
	@RequestMapping(value = "/customerCreate", method = RequestMethod.GET)
	public String customerCreate(Model model){
		
		return "/project/customer/customer_create_view";
	}
}
