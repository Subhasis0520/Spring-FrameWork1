package com.company.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pepsi {

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Pepsi(int price) {
		super();
		this.price = price;
	}

	public Pepsi() {
		super();
	}
	
	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("Start the method()");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("Ending the method()");
	}
}
