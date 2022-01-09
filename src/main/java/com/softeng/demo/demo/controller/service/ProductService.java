package com.softeng.demo.demo.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softeng.demo.demo.model.entity.Product;
import com.softeng.demo.demo.model.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product getProductById(Integer id) {
		return productRepository.findById(id).orElse(null);
	}
}
