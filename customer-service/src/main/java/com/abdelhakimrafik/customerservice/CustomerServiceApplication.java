package com.abdelhakimrafik.customerservice;

import com.abdelhakimrafik.customerservice.entities.Customer;
import com.abdelhakimrafik.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.saveAll(List.of(
				Customer.builder().name("Ali").email("ali@gmail.com").build(),
				Customer.builder().name("Abdelhakim").email("abdelhakim@gmail.com").build(),
				Customer.builder().name("Majda").email("Majda@gmail.com").build()
			));
			customerRepository.findAll().forEach(System.out::println);
		};
	}

}
