package com.myproject.springframeworkexample.helloworld;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWordSpring {

	public static void main(String[] args) {
		//1: Launch the spring context
		
	try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean("person2methodcall"));
		System.out.println(context.getBean("person3parameter"));
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context.getBean(Address.class));
	}
	
	}

}
