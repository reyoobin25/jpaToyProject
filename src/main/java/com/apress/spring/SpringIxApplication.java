package com.apress.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIxApplication {
	//이곳에서 먼저 실행 시켜야 합니다. 포트가 충돌이 나면 apllication.properties에서 포트를 바꿔서 실행 시켜주세요
	public static void main(String[] args) {
		SpringApplication.run(SpringIxApplication.class, args);
	}
}
