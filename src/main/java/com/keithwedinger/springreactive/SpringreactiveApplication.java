package com.keithwedinger.springreactive;

import com.keithwedinger.springreactive.webclients.GreetingClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringreactiveApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringreactiveApplication.class, args);
    }
}
