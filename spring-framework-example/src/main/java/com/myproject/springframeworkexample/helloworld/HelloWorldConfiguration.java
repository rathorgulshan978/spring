package com.myproject.springframeworkexample.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int age, Address address) { };
record Address(String firstLine, String city ) { };

@Configuration
public class HelloWorldConfiguration {
    
	@Bean
	public String name() {
		return "Gulshan";
	}
	
	@Bean
	public int age() {
		return 39;
	}
	
	@Bean
	public Person person() {
		return new Person("Gulshan", 40, new Address("390 Town Place CIR", "Buffalo Grove"));
		
	}
	
	@Bean
	public Person person2methodcall() {
		return new Person(name(), age(), address());
		
	}
	@Bean
	public Person person3parameter(String name,int age, Address address3) {
		return new Person(name, age, address3);
		
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("385 Town Place CIR", "Buffalo Grove");
		
	}
	
	@Bean(name = "address3")
	@Primary
	public Address address3() {
		return new Address("1630 Woodduck Ln", "Wheeling");
		
	}
}
