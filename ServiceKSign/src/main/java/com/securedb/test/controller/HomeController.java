package com.securedb.test.controller;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.securedb.test.TableService;

	@Controller
public class HomeController {
		
		TableService tableService;
		
		public TableService getTableService() {
			return tableService;
		}
		public void setTableService(TableService tableService) {
			this.tableService = tableService;
		}
		
	public HomeController() {
		System.out.println("### HomeController()생성자");
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home(Locale locale, Model model){
			
			
		return "index";
	}
	
	

}
