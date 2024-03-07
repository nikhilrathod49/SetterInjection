package com.spring.student;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("spring-bean.xml");
    //    StudentService studentService = (StudentService) factory.getBean("studentService");
   //     studentService.displayStudentInfo();
    }
}