package com.dubbo.test;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class BootUserDubboConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootUserDubboConsumerApplication.class, args);
	}

}
