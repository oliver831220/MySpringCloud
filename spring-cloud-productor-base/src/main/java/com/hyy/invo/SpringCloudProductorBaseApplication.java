package com.hyy.invo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages="com.hyy.invo.dao")
public class SpringCloudProductorBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProductorBaseApplication.class, args);
	}

}

