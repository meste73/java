package tp5.ej5.model;

import java.util.ArrayList;

public class Company {
	
	ArrayList<Employee> employees;
	
	public Company() {
		this.employees = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee e) {
		this.employees.add(e);
	}
	
	public void removeEmployee(Employee e) {
		this.employees.remove(e);
	}
	
	public double getTotalSalariesExpenses() {
		double amount = 0;
		for(int i = 0; i < this.employees.size(); i++) {
			amount += this.employees.get(i).getFinalSalary();
		}
		return amount;
	}
}
