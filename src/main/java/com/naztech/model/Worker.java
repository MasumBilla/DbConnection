package com.naztech.model;

public class Worker {
	int id;
	String name;
	int salary;
	String Dept;
	
	
	public Worker() {
		// TODO Auto-generated constructor stub
	}


	public Worker(int id, String name, int salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		Dept = dept;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getDept() {
		return Dept;
	}


	public void setDept(String dept) {
		Dept = dept;
	}


	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + ", salary=" + salary + ", Dept=" + Dept + "]";
	}
	
	

}
