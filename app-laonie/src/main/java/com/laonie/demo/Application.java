package com.laonie.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by niejiuqian on 2017/9/11.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.laonie")
@EntityScan("com.laonie.**.entity")
@EnableJpaRepositories("com.laonie.**.jpa")
public class Application extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(Application.class).run(args);
    }
}
