package com.ejercicio.v0.spring_boot_mongodbcero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@SpringBootApplication
public class SpringBootMongodbceroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongodbceroApplication.class, args);
	}

}
