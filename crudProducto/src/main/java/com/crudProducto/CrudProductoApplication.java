package com.crudProducto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudProductoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudProductoApplication.class, args);
		System.out.print("Este es el proyecto de crudProducto");
	}

}
