package com.springcore;


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
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        StudentBean student1 =(StudentBean) context.getBean("student1");
        System.out.println(student1);
       
        }
}
