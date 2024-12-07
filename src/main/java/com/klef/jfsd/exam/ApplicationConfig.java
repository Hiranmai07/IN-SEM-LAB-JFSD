package com.klef.jfsd.exam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class ApplicationConfig {

    @Bean
    public Employee employee() {
        return new Employee(101, "John Doe", 75000.0, "IT", Arrays.asList("Java", "Spring", "Hibernate"));
    }

    @Bean
    public Instructor instructor() {
        Instructor instructor = new Instructor();
        instructor.setInstructorId("I123");
        instructor.setName("Dr. Smith");
        instructor.setEmail("smith@example.com");
        instructor.setPhoneNumber("1234567890");
        return instructor;
    }

    @Bean
    public Course course() {
        Course course = new Course();
        course.setCourseId("C101");
        course.setCourseName("Spring Framework");
        course.setCredits(4);
        course.setInstructor(instructor());
        return course;
    }
}
