package com.senac.br.crud.simples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CrudSimplesApplication {

	public static void main(String[] args) {

		SpringApplication.run(CrudSimplesApplication.class, Arrays.toString(args));
	}

}
