package com.softeng.demo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.softeng.demo.demo.controller.service.StoreService;

@Controller
@RequestMapping("/store")
public class StoreController {

	@Autowired
	private StoreService storeService;
	
	@GetMapping("/index")
	public String indexPage(Model model) {
		return "index";
	}
	
	@GetMapping("/product")
	public String productPage(Model model) {
		return "product";
	}

	@GetMapping("/search")
	public String searchPage(Model model) {
		return "search";
	}

	@GetMapping("/logiout")
	public String logioutPage(Model model) {
		return "logiout";
	}
	
	@GetMapping("/cart")
	public String cartPage(Model model) {
		model.addAttribute("products", storeService.getProductsForCartPage(1));
		return "cart";
	}
	
}
