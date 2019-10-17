package com.first.springapp.firstwebspringapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



public class Customer {
	
	private Long id;
	private String name;
	private String password;
	
	public Customer(int id, String name, String password) {
		super();
		this.name = name;
		this.password = password;
		this.id = (long) id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
