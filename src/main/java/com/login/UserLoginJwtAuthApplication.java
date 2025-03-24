package com.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class UserLoginJwtAuthApplication {

	public static void main(String[] args) {
		
		/*
		 * this for testing purpose I was printing the password in console and putt in
		 * to the table
		 */
		
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        // Encrypt password
        String password = "admin";
        String encodedPassword = passwordEncoder.encode(password);
        
		System.out.println("username ::: admin");
		System.out.println("password ::: admin");
		System.out.println("Password encrypted ::: " + encodedPassword);
		SpringApplication.run(UserLoginJwtAuthApplication.class, args);
	}

}
