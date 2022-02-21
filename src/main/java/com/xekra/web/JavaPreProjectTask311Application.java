package com.xekra.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.xekra.web.dao")
@EntityScan("com.xekra.web.model")
@SpringBootApplication
public class JavaPreProjectTask311Application {

    public static void main(String[] args) {
        SpringApplication.run(JavaPreProjectTask311Application.class, args);
    }

}


