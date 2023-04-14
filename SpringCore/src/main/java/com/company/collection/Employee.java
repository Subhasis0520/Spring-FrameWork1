package com.company.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private String name;
	private List<String> phones;
	private Set<String> address;
	private Map<String, String> projects;
	
	
	
	public Employee(String name, List<String> phones, Set<String> address, Map<String, String> projects) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.projects = projects;
	}
	
	public Employee() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getProjects() {
		return projects;
	}
	public void setProjects(Map<String, String> projects) {
		this.projects = projects;
	}
	
	
}
