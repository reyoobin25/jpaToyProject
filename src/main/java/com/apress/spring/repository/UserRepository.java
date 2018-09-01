package com.apress.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apress.spring.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{ //User테이블의 id타입
	User findByUserId(String userId);
}
