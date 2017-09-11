package com.laonie.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by niejiuqian on 2017/9/9.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.laonie")
@EntityScan("com.laonie.**.entity")
@EnableJpaRepositories("com.laonie.**.jpa")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
