package br.com.gestorcultural.gestorcultural;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class GestorCulturalApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestorCulturalApplication.class, args);
	}

}
