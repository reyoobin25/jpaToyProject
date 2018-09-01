package com.apress.spring.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class BuyProduct extends BaseEntity{
	
	@ManyToOne
	private Product product;
	
	@ManyToOne
	private User user;
	
}
