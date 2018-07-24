package com.inspireminds;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import de.codecentric.boot.admin.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class SbaServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(SbaServiceApp.class, args);
	}
	

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context) {

		return args -> {

			String[] beans = context.getBeanDefinitionNames();
			Arrays.sort(beans);
			for (String bean : beans) {
				System.out.println(bean);
			}

		};

	}
	
}
