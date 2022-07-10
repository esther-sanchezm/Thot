package com.thot.boot;

import com.thot.controller.config.OpenApiConfig;
import com.thot.repository.config.MongoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({OpenApiConfig.class, MongoConfig.class})
//@CrossOrigin(origins = "http://localhost:4200")
public class ThotApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThotApplication.class, args);
	}

}
