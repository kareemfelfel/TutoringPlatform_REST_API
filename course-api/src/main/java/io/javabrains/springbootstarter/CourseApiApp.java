package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		//method that runs the spring boot application
		//from the main method in CourseApiApp.class.
		//args is the parameter passed to main.
		SpringApplication.run(CourseApiApp.class, args);
	}

}