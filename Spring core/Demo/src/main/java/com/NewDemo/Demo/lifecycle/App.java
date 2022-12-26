package com.NewDemo.Demo.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con= new ClassPathXmlApplicationContext("com/NewDemo/Demo/lifecycle/application-context.xml");
		((AbstractApplicationContext)con).registerShutdownHook();
		emp e=(emp)con.getBean("obj");
		e.disp();
		emp e1=(emp)con.getBean("obj1");
		
	}

}
