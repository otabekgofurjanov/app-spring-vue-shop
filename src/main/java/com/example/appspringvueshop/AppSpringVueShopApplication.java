package com.example.appspringvueshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class AppSpringVueShopApplication {

	@Bean
	public PasswordEncoder passwordEncoder() {
		return passwordEncoder();
	}

	public static void main(String[] args) {
		SpringApplication.run(AppSpringVueShopApplication.class, args);
	}

}
