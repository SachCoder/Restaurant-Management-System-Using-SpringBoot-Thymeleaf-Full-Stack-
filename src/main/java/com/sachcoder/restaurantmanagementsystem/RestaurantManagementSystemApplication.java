package com.sachcoder.restaurantmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.util.Properties;

@ServletComponentScan
@SpringBootApplication( )
public class RestaurantManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(RestaurantManagementSystemApplication.class);

 

        app.run(args);

    }

}
