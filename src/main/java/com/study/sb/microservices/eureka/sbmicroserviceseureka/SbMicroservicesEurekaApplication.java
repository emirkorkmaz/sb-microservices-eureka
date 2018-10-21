package com.study.sb.microservices.eureka.sbmicroserviceseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SbMicroservicesEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbMicroservicesEurekaApplication.class, args);
	}
}
