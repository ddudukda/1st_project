package com.fastcampus.projectspingboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class FastCampusProjectSpringBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastCampusProjectSpringBoardApplication.class, args);
    }

}
