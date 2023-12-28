package com.SpringCore.contructors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {
	public static void main(String[] args) {
		ApplicationContext context = 
new ClassPathXmlApplicationContext("com/SpringCore/contructors/Person_config.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(p);
		System.out.println();
		Adition a = (Adition) context.getBean("add");
		a.dosum();
		System.out.println(a);
		
	}
}
