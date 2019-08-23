package com.thghtwrks.workshop.foodymetadataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FoodyMetadataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodyMetadataServiceApplication.class, args);
	}

}
