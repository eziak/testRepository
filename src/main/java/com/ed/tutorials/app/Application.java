package com.ed.tutorials.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import java.text.ParseException;



@SpringBootApplication
@ComponentScan
public class Application extends SpringBootServletInitializer{
	
		
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
	
	public static void main(String[] args) throws ParseException {
		System.out.println("starting application Employees");
		SpringApplication.run(Application.class, args);
		
		
	}
	


}
