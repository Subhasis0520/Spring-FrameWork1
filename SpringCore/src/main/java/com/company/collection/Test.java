package com.company.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("com/company/collection/emp.xml");

        Employee e1 = (Employee) ac.getBean("emp1");
        
        System.out.println(e1.getName());
        System.out.println(e1.getAddress());
        System.out.println(e1.getPhones());
        System.out.println(e1.getProjects());
	}

}
