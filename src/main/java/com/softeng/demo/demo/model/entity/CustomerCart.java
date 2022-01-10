package com.softeng.demo.demo.model.entity;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CustomerCart {
	
	private Integer cartId;
	private Integer productId;
	private BigDecimal price;
	private Integer quantity;
	private String productName;
	private String name;
	private BigDecimal total;
  private String mainImage;
	
}
