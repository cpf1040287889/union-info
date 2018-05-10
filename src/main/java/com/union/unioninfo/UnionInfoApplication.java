package com.union.unioninfo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.union.unioninfo.dao")
public class UnionInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnionInfoApplication.class, args);
	}
}
