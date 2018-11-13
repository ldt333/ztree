package com.test.ztree;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.test.ztree.idao")
@SpringBootApplication
public class MyztreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyztreeApplication.class, args);
	}
}
