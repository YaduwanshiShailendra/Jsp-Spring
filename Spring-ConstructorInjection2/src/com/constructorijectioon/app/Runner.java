package com.constructorijectioon.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("context.xml");
		
		Student ram = container.getBean("s1", Student.class);
		System.out.println(ram);
		
		
	//	Student s = new Student();
	}

}
