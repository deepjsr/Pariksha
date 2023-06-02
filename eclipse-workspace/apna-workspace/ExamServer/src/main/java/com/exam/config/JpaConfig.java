package com.exam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.exam.services.UserService;
import com.exam.services.implimentation.UserServiceImplements;

@Configuration
@EnableJpaRepositories(basePackages = "com.exam.repo")
public class JpaConfig {

    @Bean("UserService")
    public UserService userService(){
        return new UserServiceImplements();
    }

}