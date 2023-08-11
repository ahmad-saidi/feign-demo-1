package com.training.feign.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(FeignDemo1Application.class, args);
	}

}
