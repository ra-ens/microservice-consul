package com.abdelhakimrafik.billingservice;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.vault.core.VaultTemplate;

import java.util.Map;

@SpringBootApplication
@AllArgsConstructor
public class BillingServiceApplication {

	private VaultTemplate vaultTemplate;

	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return args -> {
			vaultTemplate
					.opsForVersionedKeyValue("secret")
					.put("keypair", Map.of("privateKey","p5487p","publicKey","qw485wq"));
		};
	};
}
