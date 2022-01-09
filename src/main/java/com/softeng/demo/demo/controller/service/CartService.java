package com.softeng.demo.demo.controller.service;

import java.math.BigDecimal;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softeng.demo.demo.model.entity.CartItem;
import com.softeng.demo.demo.model.entity.Product;
import com.softeng.demo.demo.model.repository.CartRepository;
import com.softeng.demo.demo.model.repository.ProductRepository;

@Service
@Transactional
public class CartService {

	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<CartItem> getAll() {
		return cartRepository.findAll();
	}
	
	public List<CartItem> getByCustomerId(Integer id) {
		return cartRepository.findByCustomerId(id);
	}
	
	public BigDecimal updateQuantity(Integer productId, Integer quantity, Integer customerId) {
		System.err.println("productId " + productId + " - quantity: " + quantity);
		cartRepository.updateQuantity(quantity, productId, customerId);
		Product product = productRepository.findById(productId).get();
		BigDecimal subtotal = BigDecimal.valueOf(quantity).multiply(product.getPrice());
		return subtotal;
	}
}
