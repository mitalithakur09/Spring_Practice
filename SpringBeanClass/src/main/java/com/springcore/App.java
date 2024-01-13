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
        ApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml");
        /*Student_Class student1 = (Student_Class) context.getBean("student1");
        Student_Class student2 = (Student_Class) context.getBean("student2");
        Student_Class student3 = (Student_Class) context.getBean("student3");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);*/
        
        Employee emp1 = (Employee) context.getBean("emp1");
        System.out.println(emp1);
        
    }
}
