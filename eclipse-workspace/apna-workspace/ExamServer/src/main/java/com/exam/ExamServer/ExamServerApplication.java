package com.exam.ExamServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.exam.services.UserService;
@EntityScan("com.exam.models")
@SpringBootApplication
@EnableJpaRepositories("com.exam.repo")
@ComponentScan("com.exam.controller")


public class ExamServerApplication implements CommandLineRunner {
	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		
		
		SpringApplication.run(ExamServerApplication.class, args);
	
	 }

	@Override
	public void run(String... args) throws Exception {
		 System.out.println("Starting code");
		 
		 
	}

}
