package com.skp.IdGeneration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class IdGenerationApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdGenerationApplication.class, args);
	}

}
