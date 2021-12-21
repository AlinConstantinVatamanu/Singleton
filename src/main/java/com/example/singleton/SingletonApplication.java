package com.example.singleton;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Persona.Persona;

@SpringBootApplication
public class SingletonApplication implements CommandLineRunner {

	private Persona persona;
	
	public static void main(String[] args) {
		SpringApplication.run(SingletonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Persona instanciaPersona1 = persona.getInstance("Juan");
		System.out.println(instanciaPersona1.getNombre());
		
		Persona instanciaPersona2 = persona.getInstance("Antonio");
		System.out.println(instanciaPersona2.getNombre());
		
	}

}
