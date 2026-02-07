package io.matoshri.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.resilience.annotation.EnableResilientMethods;
import org.springframework.resilience.annotation.Retryable;
import org.springframework.web.service.registry.ImportHttpServices;

@SpringBootApplication
@ImportHttpServices(basePackages = "io.matoshri")
@EnableResilientMethods
public class Demo2Application {

    static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }

    @Retryable(
            maxRetries = 3,
            delay = 2000,
            multiplier = 2.0,
            includes = IllegalArgumentException.class
    )
    public String foo() {
        return "value";
    }

}
