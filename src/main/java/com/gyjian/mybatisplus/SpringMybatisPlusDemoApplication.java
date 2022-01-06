package com.gyjian.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gyjian.mybatisplus.mapper")
public class SpringMybatisPlusDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMybatisPlusDemoApplication.class, args);
	}

}
