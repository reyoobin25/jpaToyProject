package com.apress.spring.util;

import java.time.LocalDateTime;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.stereotype.Component;

import com.apress.spring.domain.BaseEntity;

@Component
public class JpaEntityListener {
	@PrePersist
	public void persist(BaseEntity baseEntity) {
		baseEntity.setCreatedAt(LocalDateTime.now());
	}
	@PreUpdate
	public void update(BaseEntity baseEntity) {
		baseEntity.setUpdatedAt(LocalDateTime.now());
	}
}
