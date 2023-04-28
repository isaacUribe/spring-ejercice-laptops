package com.example.OB_ejercicio6Rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObEjercicio6RestApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(ObEjercicio6RestApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop hp = new Laptop(null,"HP","njst200","Intel i5",16);
		repository.save(hp);

		Laptop lenovo = new Laptop(null,"lenovo","njst200","Intel i5",16);
		repository.save(lenovo);


	}

}
