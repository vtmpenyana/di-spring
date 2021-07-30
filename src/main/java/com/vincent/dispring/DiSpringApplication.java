package com.vincent.dispring;

import com.vincent.dispring.controllers.ConstructorInjectedController;
import com.vincent.dispring.controllers.HelloController;
import com.vincent.dispring.controllers.PropertyInjectedController;
import com.vincent.dispring.controllers.SetterInjectedController;
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

		//DI with the Spring Framework
		System.out.println("-------------> Property Injected");

		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-------------> Setter Injected");
		SetterInjectedController setterInjectedController =
				(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.greetingService.sayGreeting());

		System.out.println("-------------> Constructor Injected");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreetingService().sayGreeting());


	}

}
