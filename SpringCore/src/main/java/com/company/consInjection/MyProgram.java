package com.company.consInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyProgram {

	public static void main(String[] args) {

     ApplicationContext ac = new ClassPathXmlApplicationContext("com/company/consInjection/person.xml");

     Person person = (Person) ac.getBean("p1");
     System.out.println(person);
     
     Addition a = (Addition) ac.getBean("add");
     a.doSum();
	}

}
