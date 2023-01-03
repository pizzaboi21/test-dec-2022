package com.example.demo.helllo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class helloConfig {

    @Bean
    CommandLineRunner commandLineRunner(helloRepository helloRepository) {
        return args -> {

            testTable first = new testTable(
                    "Rohan",
                    "Guha",
                    "rohanguha9916@gmail.com",
                    "1234",
                    "1234"
            );

            testTable second = new testTable(
                    "abc",
                    "def",
                    "abc@gmail.com",
                    "1234",
                    "1234"
            );

            helloRepository.saveAll(
                    List.of(first,second)
            );

        };

    }

}
