package com.tensquare.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

@SpringBootApplication
@EnableDiscoveryClient
public class SearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchApplication.class,args);
	}

	@Bean
	public IdWorker idWorker() {
		return new IdWorker(1,1);
	}
}
