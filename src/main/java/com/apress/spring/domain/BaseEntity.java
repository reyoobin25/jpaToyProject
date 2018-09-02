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

//롬복을 통해 get,set,toString등 사용가능
@Data
@EqualsAndHashCode(callSuper=false)
@MappedSuperclass
@EntityListeners(JpaEntityListener.class)
//id값이랑 createdAt, updatedAt등 db에 반복해서 들어가는 부분은 따로 클래스로 뺴네어 상속받을 수 있도록 한다.
public class BaseEntity extends SerializableSerializer{

	private static final long serialVersionUID = 4694613807707647533L;
	
	
	//pk, 자동 순번 정하기
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	//pk이외의 값
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
}
