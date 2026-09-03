package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        System.out.println("Prototype Scope eg");
        Student PrototypeStudent1 = context.getBean("PrototypeStudent", Student.class);
        Student PrototypeStudent2 = context.getBean("PrototypeStudent", Student.class);
        PrototypeStudent1.setName("Ayush Sharma");
        PrototypeStudent2.setName("Ayush Sharma");
        PrototypeStudent1.showDetails();
        PrototypeStudent2.showDetails();
        System.out.println("Both Student Objects are Same :  " + (PrototypeStudent1== PrototypeStudent2));
    }
    //-prototype will create diff object for every request
}

      /*  System.out.println("Singleton Scope Eg:");
        Student singletonStudent1 = context.getBean("SingletonStudent", Student.class);
        Student singletonStudent2 = context.getBean("SingletonStudent", Student.class);
        singletonStudent1.setName("Ayush Sharma");
        singletonStudent2.setName("Aryan Sharma");
        singletonStudent1.showDetails();
        singletonStudent2.showDetails();
        System.out.println("Both Student Objects are Same :  " + (singletonStudent1 == singletonStudent2));
-----  - - - ---------------------------------------------------------------------
      For singleton even i intentionally cerated two but
        still overwrite and final single object will provide
-------------------------------------------------------------------------
    }
}

       */