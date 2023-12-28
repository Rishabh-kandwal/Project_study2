package com.SpringCore.ReferenceTypeCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args)
	{
		ApplicationContext context= new ClassPathXmlApplicationContext
				("com/SpringCore/ReferenceTypeCollection/Reference_config.xml");
		A temp=(A) context.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());
	}

}
