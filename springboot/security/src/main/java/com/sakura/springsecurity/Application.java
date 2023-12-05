package com.sakura.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sakura
 */
@SpringBootApplication(scanBasePackages = "com.sakura")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
    
}
