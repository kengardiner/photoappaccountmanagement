package com.javastrong.api.account.photoappaccountmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PhotoappaccountmanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoappaccountmanagementApplication.class, args);
    }

}
