package com.kentrasoft.cmsa.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class KentraCmsAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(KentraCmsAuthApplication.class, args);
	}
}
