package com.pineblock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pineblock.dao")
public class PineblockApplication {

	public static void main(String[] args) {
		SpringApplication.run(PineblockApplication.class, args);
	}

}
