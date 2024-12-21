package com.devsuperior.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



@SpringBootApplication
public class DemoApplication implements CommandLineRunner{


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		PasswordEncoder encoder = new BCryptPasswordEncoder();

		System.out.println(encoder.encode("123456"));

		boolean matches = encoder.matches("123456", "$2a$10$HfdsCjIVTiAZhWE1fALBrON8lObj9sAZLZCHLguoA6G0SiMWwQ2rG");
		System.out.println(matches);

	}
}
