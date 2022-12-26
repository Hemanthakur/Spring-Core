package com.NewDemo.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con=new ClassPathXmlApplicationContext("application-context2.xml");
    	//bean Scope
    	Student s1=(Student)con.getBean("stu");
    	System.out.println(s1);
    	System.out.println(s1.hashCode());
    	Student s=(Student)con.getBean("stu");
    	System.out.println(s);
    	System.out.println(s.hashCode());
    	//Constructor method
        Student s2=(Student)con.getBean("stud");
    	System.out.println(s2);
    	System.out.println(s2.hashCode());
    
    }
}
