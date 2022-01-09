package com.softeng.demo.demo.model.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OrderId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7570714564507353118L;
	private Integer id;
	private String cartItemsId;
}
