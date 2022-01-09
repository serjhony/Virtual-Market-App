package com.softeng.demo.demo.model.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Table(name = "orders")
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(OrderId.class)
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "id")
	private Integer id;
	
	@Id
	@Column(name = "cart_items_id")
	private String cartItemsId;
	
	@Column(name = "customer_id")
	private Integer customerId;
	
	@Column(name = "total")
	private BigDecimal total;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "payment_control")
	private boolean paymentControl;
}
