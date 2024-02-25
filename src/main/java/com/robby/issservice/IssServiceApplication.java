package com.robby.issservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class IssServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IssServiceApplication.class, args);
	}

}
