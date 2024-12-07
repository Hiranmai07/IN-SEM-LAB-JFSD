package com.klef.jfsd.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Employee employee = context.getBean(Employee.class);
        System.out.println(employee);

        Course course = context.getBean(Course.class);
        System.out.println(course);
    }
}
