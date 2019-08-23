package com.thghtwrks.workshop.orderpaymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OrderPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderPaymentServiceApplication.class, args);
	}

}
