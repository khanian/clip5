package com.demo.clip5;

import com.demo.clip5.service.KafkaManager;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Clip5Application {

    public static void main(String[] args) {
        SpringApplication.run(Clip5Application.class, args);
    }

    @Bean
    public ApplicationRunner runner(KafkaManager kafkaManager) {
        return args -> {
            kafkaManager.describeTopicConfigs();
        };
    }

}
