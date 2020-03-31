package com.example.demoRestClientApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoRestClientAppApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoRestClientAppApplication.class, args);

		context.getBean(MyClientComponent.class).callService();
	}

}
