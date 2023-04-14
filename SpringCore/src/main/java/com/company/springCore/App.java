package com.company.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    
     ApplicationContext ac = new ClassPathXmlApplicationContext("student.xml");
     
     Student s1 = (Student) ac.getBean("student1");
     Student s2 = (Student) ac.getBean("student2");
     System.out.println(s1.getStudentAddress());
     System.out.println(s1);
     System.out.println(s2);
  }
}
