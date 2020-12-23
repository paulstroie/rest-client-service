package org.ps.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableWebMvc
@EnableFeignClients
@SpringBootApplication(scanBasePackages = {"org.ps.client"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}