package com.apress.spring.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Product extends BaseEntity {

	private static final long serialVersionUID = -525970150922368781L;
	
	private String productName;
	private String productContents;
	private String productImg;
	private Integer productPrice;
	
	@ManyToOne
	private User user;

	@OneToMany(mappedBy="product")
	private List<BuyProduct> buyProducts;
}
