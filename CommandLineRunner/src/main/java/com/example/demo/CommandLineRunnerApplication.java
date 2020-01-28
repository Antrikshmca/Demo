package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.MessageServiceProvider;

@SpringBootApplication
public class CommandLineRunnerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication
				.run(CommandLineRunnerApplication.class, args);
		MessageServiceProvider messageServiceProvider = configurableApplicationContext
				.getBean(MessageServiceProvider.class);
		String message = messageServiceProvider.message();
		System.out.println(message);
	}

}
