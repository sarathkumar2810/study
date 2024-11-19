package com.working;

public class employe {
	
	private int id;
	private long salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employe [id=" + id + ", salary=" + salary + "]";
	}
	public employe(int id, long salary) {
		super();
		this.id = id;
		this.salary = salary;
	}

}
