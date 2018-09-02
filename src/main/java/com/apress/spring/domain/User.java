package com.apress.spring.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;


import lombok.Data;

@Data
@Entity
public class User extends BaseEntity {

	private static final long serialVersionUID = -2594960388060961047L;
	
	private String userId;
	private String password;
	private String userName;
	private String email;
	
	//사용자는 물건을 여러개 구매가 가능하니까 1:N 연결
	
	@OneToMany(mappedBy="user")
	private List<Product> products;
	
	@OneToMany(mappedBy="user")
	private List<BuyProduct> buyProducts;

}
