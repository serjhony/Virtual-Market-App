package com.softeng.demo.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softeng.demo.demo.model.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
