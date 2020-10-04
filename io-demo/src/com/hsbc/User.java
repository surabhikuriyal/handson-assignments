package com.hsbc;

import java.io.Serializable;

public class User implements Serializable {
	private String name;
	private int age;
	
	// all the subclasses will be serializable if a super class implements Serializable
	// has-a relationship classes wouldn't be serializable, you must implement Serialable to such classes explicitly
	
	
	
	public User() {
		super();
	}
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
}
