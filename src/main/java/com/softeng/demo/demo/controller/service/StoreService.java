package com.softeng.demo.demo.controller.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softeng.demo.demo.model.entity.CartItem;
import com.softeng.demo.demo.model.entity.CustomerCart;
import com.softeng.demo.demo.model.entity.Product;
import com.softeng.demo.demo.model.mapper.CustomerCartMapper;

@Service
public class StoreService {

	@Autowired
	private CartService cartService;
	
	@Autowired
	private CustomerCartMapper mapper;
	
	@Autowired ProductService productService;
	
	@SuppressWarnings("null")
	public List<CustomerCart> getProductsForCartPage(Integer id) {
		List<CartItem> cartItemsForACustomer = cartService.getByCustomerId(id);
		List<CustomerCart> response = new ArrayList<>();
		for (CartItem item : cartItemsForACustomer) {
			Product product = productService.getProductById(item.getProduct().getId());
			CustomerCart cart = mapper.mapProductAndCartToCustomerCart(product, item);
			response.add(cart);
		}
		return response;
	}

	
}
