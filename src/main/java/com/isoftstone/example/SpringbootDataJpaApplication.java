package com.isoftstone.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @EnableJpaAuditing:开启监听
 */
@SpringBootApplication
@EnableJpaAuditing
public class SpringbootDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDataJpaApplication.class, args);
    }

}
