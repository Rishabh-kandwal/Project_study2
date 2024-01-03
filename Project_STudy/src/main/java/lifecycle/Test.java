package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args)
	{
		AbstractApplicationContext c=new ClassPathXmlApplicationContext("file:src/main/java/lifecycle/Jlabii_config.xml");
		jlabii j=(jlabii)c.getBean("j1");
		System.out.println(j);
		c.registerShutdownHook();
	}
}
