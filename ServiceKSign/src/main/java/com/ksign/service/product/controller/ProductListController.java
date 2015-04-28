package com.ksign.service.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductListController {

	public ProductListController() {
		System.out.println("ProductListController() 생성자 %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	}
	
	/**
	 * product List View
	 * 제품 리스트
	 *  
	**/
	@RequestMapping(value = "/productList", method = RequestMethod.GET)
	public String customerListView(Model model)
	{
		return "/product/product_list_view";
	}
}
