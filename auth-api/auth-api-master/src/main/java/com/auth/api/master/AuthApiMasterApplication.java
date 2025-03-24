package com.auth.api.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AuthApiMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthApiMasterApplication.class, args);
    }

}
