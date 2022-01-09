package com.softeng.demo.demo.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.softeng.demo.demo.controller.service.CartService;
import com.softeng.demo.demo.controller.service.OrderService;
import com.softeng.demo.demo.model.entity.Order;

@Controller
@RequestMapping("/store/cart")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private OrderService orderService;
	
	@ResponseBody
	@PostMapping("/update/{pid}/{qty}")
	public String updateQuantity(@PathVariable("pid") Integer productId,
			@PathVariable("qty") Integer quantity) {
		BigDecimal subtotal = cartService.updateQuantity(productId, quantity, 1);
		return String.valueOf(subtotal);
	}
	
	@ResponseBody
	@PostMapping("/placeAnOrder")
	public void placeAnOrder(@RequestBody Order order) {
		orderService.placeAnOrder(order);
	}

}
