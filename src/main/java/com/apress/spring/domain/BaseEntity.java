package com.apress.spring.domain;

import java.time.LocalDateTime;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.apress.spring.util.JpaEntityListener;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@MappedSuperclass
@EntityListeners(JpaEntityListener.class)
public class BaseEntity extends SerializableSerializer{

	private static final long serialVersionUID = 4694613807707647533L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
}
