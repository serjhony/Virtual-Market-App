package com.softeng.demo.demo.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softeng.demo.demo.model.entity.Order;
import com.softeng.demo.demo.model.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public void placeAnOrder(Order order) {
		System.out.println(order.toString());
		orderRepository.save(order);
	}
}
