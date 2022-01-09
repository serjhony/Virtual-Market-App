package com.softeng.demo.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softeng.demo.demo.model.entity.Order;
import com.softeng.demo.demo.model.entity.OrderId;

public interface OrderRepository extends JpaRepository<Order, OrderId>{

}
