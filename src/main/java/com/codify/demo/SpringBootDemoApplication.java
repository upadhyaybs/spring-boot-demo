package com.codify.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootDemoApplication {

	
	public static void main(String[] args) {
		String ENV_PORT = System.getenv().get("PORT");
	    String ENV_DYNO = System.getenv().get("DYNO");
	    System.out.println("Environment PORT :"+ ENV_PORT);
	    System.out.println("Environment DYNO :"+ ENV_DYNO);
	    if(ENV_PORT != null && ENV_DYNO != null) {
	        System.getProperties().put("server.port", ENV_PORT);
	    }
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}