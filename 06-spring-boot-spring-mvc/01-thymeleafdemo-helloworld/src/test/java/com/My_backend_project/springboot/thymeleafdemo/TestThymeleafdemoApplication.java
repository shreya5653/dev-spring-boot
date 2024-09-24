package com.My_backend_project.springboot.thymeleafdemo;

import org.springframework.boot.SpringApplication;

public class TestThymeleafdemoApplication {

	public static void main(String[] args) {
		SpringApplication.from(ThymeleafdemoApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
