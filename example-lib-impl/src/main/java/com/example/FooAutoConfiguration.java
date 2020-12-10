package com.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooAutoConfiguration {

    @Bean
    public Foo foo() {
        return new FooImpl();
    }
}
