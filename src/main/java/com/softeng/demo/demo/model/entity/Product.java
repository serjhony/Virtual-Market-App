package com.softeng.demo.demo.model.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "short_desc")
	private String shortDesc;
	
	@Column(name = "full_desc")
	private String fullDesc;
	
	@Column(name = "main_image")
	private String mainImage;
	
	@Column(name = "stock")
	private Integer stock;
	
	@Column(name = "brand_name")
	private String brandName;
	
	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "category")
	private String category;
	
	@OneToOne(mappedBy = "product")
    private CartItem cartItem;
	
}
