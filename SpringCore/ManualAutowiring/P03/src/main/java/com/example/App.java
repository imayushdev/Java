package com.example;

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

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
       /* CarByName carByName = applicationContext.getBean("carByName", CarByName.class);
        carByName.drive();

        */
        System.out.println("________________________________________________________________");
        CarByType carByType = applicationContext.getBean("carByType",CarByType.class);
        carByType.drive();

    }
}
