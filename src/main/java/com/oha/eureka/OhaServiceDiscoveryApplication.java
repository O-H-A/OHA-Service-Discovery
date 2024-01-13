package com.oha.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OhaServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(OhaServiceDiscoveryApplication.class, args);
    }

}
