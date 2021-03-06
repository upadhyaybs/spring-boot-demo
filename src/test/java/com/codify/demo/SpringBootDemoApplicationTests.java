package com.codify.demo;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.codify.demo.controller.GreetingsController;

@SpringBootTest
@ActiveProfiles("test")
public class SpringBootDemoApplicationTests {

	@Autowired
	GreetingsController demoController;
	
	
	@Test
	public void contextLoads() {
		assertThat(demoController).isNotNull();
	}

}
