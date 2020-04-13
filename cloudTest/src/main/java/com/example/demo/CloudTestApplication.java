package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//开启EurekaServer注册服务
@EnableEurekaServer
public class CloudTestApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(CloudTestApplication.class).run(args);
//		SpringApplication.run(CloudTestApplication.class, args);
	}

}
