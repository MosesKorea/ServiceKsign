package com.ksign.service.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ProjectViewController {
	
	
	public ProjectViewController() {
		System.out.println("ProjectViewController()");
	}
	
	@RequestMapping(value = "/projectView", method = RequestMethod.GET)
	public String projecview(Model model) throws Exception{
			
			
		return "project/project_view";
	}
	
	

}
