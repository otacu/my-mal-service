package com.egoist.mal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.egoist.mal.dao")//将项目中对应的mapper类的路径加进来就可以了
@SpringBootApplication
public class MyMalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyMalServiceApplication.class, args);
	}

}
