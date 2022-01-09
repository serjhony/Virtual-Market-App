package com.softeng.demo.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softeng.demo.demo.model.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
