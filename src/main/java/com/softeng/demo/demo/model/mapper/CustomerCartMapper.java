package com.softeng.demo.demo.model.mapper;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.softeng.demo.demo.model.entity.CartItem;
import com.softeng.demo.demo.model.entity.CustomerCart;
import com.softeng.demo.demo.model.entity.Product;

@Component
public class CustomerCartMapper {

	public CustomerCart mapProductAndCartToCustomerCart(Product product, CartItem cartItem) {
		CustomerCart customerCart = new CustomerCart();
		customerCart.setCartId(cartItem.getId());
		customerCart.setPrice(product.getPrice());
		customerCart.setProductId(product.getId());
		customerCart.setProductName(product.getName());
		customerCart.setQuantity(cartItem.getQuantity());
		customerCart.setTotal(BigDecimal.valueOf(cartItem.getQuantity()).multiply(product.getPrice()));
    customerCart.setMainImage(product.getMainImage());
		return customerCart;
	}
}
