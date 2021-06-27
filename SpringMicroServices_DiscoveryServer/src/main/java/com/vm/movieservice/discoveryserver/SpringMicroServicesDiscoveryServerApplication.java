package com.vm.movieservice.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringMicroServicesDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroServicesDiscoveryServerApplication.class, args);
	}

}
