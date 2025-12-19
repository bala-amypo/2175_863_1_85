package com.example.demo;

import org.springframework.boot.SpringApplication;
demo/src/main/java/com/example/demoimport org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ServletComponentScan
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
