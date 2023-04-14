package com.company.lifeCycle;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyProgram {

	public static void main(String[] args) {

		AbstractApplicationContext con = new ClassPathXmlApplicationContext("com/company/lifeCycle/pepsi.xml");

	   Pepsi p = (Pepsi) con.getBean("p1");
	   System.out.println(p.toString());
	   con.registerShutdownHook();
	}

}
