package com.example.springboot.demo.sprint6di;

import com.example.springboot.demo.sprint6di.controllers.FauxController;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootApplication.class, args);

//		SpringApplication.run(SpringBootApplication.class, args);
		FauxController fauxController = ctx.getBean(FauxController.class);

//		System.out.println("In Main Method");

		System.out.println(fauxController.getDatasource());
	}

}
