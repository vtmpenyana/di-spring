package com.vincent.dispring;

import com.vincent.dispring.controllers.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiSpringApplication.class, args);
		HelloController helloController = (HelloController) ctx.getBean("helloController");
		String text = helloController.greet();
		System.out.println(text);
	}

}
