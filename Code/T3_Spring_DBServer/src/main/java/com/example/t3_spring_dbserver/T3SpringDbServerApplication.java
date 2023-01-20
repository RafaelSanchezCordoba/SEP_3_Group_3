package com.example.t3_spring_dbserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class T3SpringDbServerApplication  {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(T3SpringDbServerApplication.class, args);
	}


}
