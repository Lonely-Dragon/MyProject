package com.sakura.register.nacos;

import com.alibaba.nacos.api.annotation.NacosProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
/**
 * springboot nacos
 * @NacosPropertySource( dataId = "test",autoRefreshed = true)
 * @EnableNacosConfig(globalProperties = @NacosProperties(serverAddr = "127.0.0.1:8848"))
 */
public class NacosApp {
    public static void main(String[] args) {
        SpringApplication.run(NacosApp.class);
    }
    
}
