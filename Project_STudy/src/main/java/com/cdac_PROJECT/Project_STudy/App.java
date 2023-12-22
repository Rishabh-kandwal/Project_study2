package com.cdac_PROJECT.Project_STudy;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context =new 
ClassPathXmlApplicationContext("file:src/main/java/com/cdac_PROJECT/Project_STudy/config.xml");
        bean1 b=(bean1) context.getBean("bean1");
        System.out.println(b);
    }
}// test changes
