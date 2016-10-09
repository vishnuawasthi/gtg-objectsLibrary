package com.gtg.lib;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("gtg-objectsLibrary - start");
		SpringApplication.run(Application.class, args);
		System.out.println("gtg-objectsLibrary - end");

	}

	public void run(String... arg0) throws Exception {
	}

}
