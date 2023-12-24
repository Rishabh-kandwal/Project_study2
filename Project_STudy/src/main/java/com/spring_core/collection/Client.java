package com.spring_core.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		System.out.println("Inside client");
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring_core/collection/Student_config.xml");
		Student stu= (Student)context.getBean("stu1");
		System.out.println(stu.getName());
		System.out.println(stu.getPhones());
		System.out.println(stu.getAdd());
		System.out.println(stu.getCourse());
	}

}
