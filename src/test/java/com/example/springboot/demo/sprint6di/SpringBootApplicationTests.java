package com.example.springboot.demo.sprint6di;

import com.example.springboot.demo.sprint6di.controllers.FauxController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("qa")
@SpringBootTest
class SpringBootApplicationTests {

	@Autowired
	private FauxController fauxController;

	@Test
	public void testSimpleDatasource() {
		System.out.println(fauxController.getDatasource());
	}
	@Test
	void contextLoads() {
	}

}
