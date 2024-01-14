package com.example.springbootjenkins;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJenkinsApplication.class, args);
    }

    @Value("${my.env.var1}")
    private String envVar1;

    @Value("${my.env.var2}")
    private String envVar2;

    @GetMapping("/test")
    public String test() {
        return envVar1+envVar2;
    }
}
