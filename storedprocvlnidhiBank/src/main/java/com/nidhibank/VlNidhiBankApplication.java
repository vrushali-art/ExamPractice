package com.nidhibank;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.nidhibank")
public class VlNidhiBankApplication {
    public static void main(String[] args) {
        SpringApplication.run(VlNidhiBankApplication.class, args);
        
    }
    
    @Bean
     ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
