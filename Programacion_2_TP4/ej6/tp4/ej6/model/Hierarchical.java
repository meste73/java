package tp4.ej6.model;

import java.util.ArrayList;

public class Hierarchical extends Employee {
	
	private ArrayList<Employee> employees;
	
	public Hierarchical(String name, String lname, int age, String post, int fileNumber, double salary) {
		super(name, lname, age, post, fileNumber, salary);
		this.employees = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee e) {
		this.employees.add(e);
	}
	
	public void removeEmployee(Employee e) {
		this.employees.remove(e);
	}
}
