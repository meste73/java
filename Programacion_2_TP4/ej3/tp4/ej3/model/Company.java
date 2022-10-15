package tp4.ej3.model;

import java.util.ArrayList;

public class Company {
	
	private String companyName;
	private ArrayList<Employee> employees;
	private ArrayList<Sale> sales;
	
	public Company(String name) {
		this.companyName = name;
		this.employees = new ArrayList<Employee>();
	}
	
	public String getCompanyName() {
		return this.companyName;
	}
	
	public void setCompanyName(String name) {
		this.companyName = name;
	}
	
	public void addEmployee(Employee e) {
		this.employees.add(e);
	}

	public void addSale(Sale s) {
		this.sales.add(s);
	}
	
	public double getEmployeeSalary(Employee e) {
		return e.salaryCalculator();
	}

}
