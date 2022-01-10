package com.softeng.demo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.softeng.demo.demo.controller.service.ProductService;
import com.softeng.demo.demo.controller.service.StoreService;

@Controller
@RequestMapping("/store")
public class StoreController {

	@Autowired
	private StoreService storeService;

  @Autowired
  private ProductService productService;
	
	@GetMapping("/index")
	public String indexPage(Model model) {
    model.addAttribute("products", productService.getAll());
		return "index";
	}
	
	@GetMapping("/product/{id}")
	public String productPage(@PathVariable Integer id ,Model model) {
    model.addAttribute("product", productService.getProductById(id));
		return "product";
	}

  @GetMapping("/products")
  public String productsPage(Model model) {
    // model.addAttribute(attributeName, attributeValue)
    return "products";
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
