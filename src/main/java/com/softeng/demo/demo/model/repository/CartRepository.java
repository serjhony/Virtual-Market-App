package com.softeng.demo.demo.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.softeng.demo.demo.model.entity.CartItem;

public interface CartRepository extends JpaRepository<CartItem, Integer>{

	@Query(value = "SELECT id, product_id, customer_id, quantity\r\n"
			+ "	FROM public.cart_items\r\n"
			+ "	WHERE customer_id = :id", nativeQuery = true)
	List<CartItem> findByCustomerId(@Param("id") Integer id);

	
	@Query(value = "update public.cart_items SET quantity = :quantity where product_id = :productId and customer_id = :customerId", nativeQuery = true)
	@Modifying
	void updateQuantity(@Param("quantity") Integer quantity, @Param("productId") Integer productId, @Param("customerId") Integer id);

}
