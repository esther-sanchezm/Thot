package com.thot.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@CrossOrigin(origins = "http://localhost:4200")
public class ThotApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThotApplication.class, args);
	}

}
