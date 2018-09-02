package com.apress.spring.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class BuyProduct extends BaseEntity{
	//구매된 목록을 중심으로 생각해보면 User와 Product가 N:1로 연결되어 있다.
	@ManyToOne
	private Product product;
	
	@ManyToOne
	private User user;
	
}
