package net.javaheap.springApp;

import net.javaheap.springApp.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloController.class, args);
	}

}
