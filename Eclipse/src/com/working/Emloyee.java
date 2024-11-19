package com.working;

public class Emloyee {
	
	public int Id;
	public String name;
	public double salary;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emloyee [Id=" + Id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Emloyee(int id, String name, double salary) {
		super();
		Id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	
	

}
