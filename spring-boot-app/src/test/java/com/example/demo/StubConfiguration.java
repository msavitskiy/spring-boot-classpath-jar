package com.example.demo;

import com.example.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StubConfiguration {

    @Bean
    public Foo foo() {
        return () -> {

        };
    }
}
