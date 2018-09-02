package com.apress.spring.util;

import java.time.LocalDateTime;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.stereotype.Component;

import com.apress.spring.domain.BaseEntity;

@Component
public class JpaEntityListener {
	//만들어질때마다
	@PrePersist
	public void persist(BaseEntity baseEntity) {
		baseEntity.setCreatedAt(LocalDateTime.now());
	}
	//업데이트될때마다 
	@PreUpdate
	public void update(BaseEntity baseEntity) {
		baseEntity.setUpdatedAt(LocalDateTime.now());
	}
	//리스너를 통해 localdatetime으 찍어줄 수 있도록 한다.
}
