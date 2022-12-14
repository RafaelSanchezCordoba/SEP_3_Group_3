package com.example.t3_spring_dbserver;

import com.example.t3_spring_dbserver.GrpcImpl.SockCardComunicatorImpl;
import com.example.t3_spring_dbserver.repository.ISockCardRepository;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class T3SpringDbServerApplication  {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(T3SpringDbServerApplication.class, args);
	}


}
