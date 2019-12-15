package com.wcs.app.sb.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class MasterServiceApplication {

	public static void main(String[] args) {
		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiii");
		SpringApplication.run(MasterServiceApplication.class, args);
	}

}
