package com.cdac_PROJECT.Project_STudy;

import java.io.File;
import java.util.List;
import java.util.Stack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {

			System.out.println("Hello World!");
			ApplicationContext context = new ClassPathXmlApplicationContext(
					"file:src/main/java/com/cdac_PROJECT/Project_STudy/config.xml");
			bean1 b = (bean1) context.getBean("bean1");
			System.out.println(b);
			bean1 bb = (bean1) context.getBean("bean");
			System.out.println(bb);
			bean1 be = (bean1) context.getBean("be");
			System.out.println(be);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
// test changes
