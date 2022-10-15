package tp4.ej3.model;

public class Employee {

	private String name;
	private int dni;
	private double weekSalary;

	public Employee(String name, int dni, double salary) {
		this.name = name;
		this.dni = dni;
		this.weekSalary = salary;
	}

	public String getName() {
		return this.name;
	}

	public int getDni() {
		return this.dni;
	}
	
	public double getWeekSalary() {
		return this.weekSalary;
	}

	public double salaryCalculator() {
		return this.weekSalary;
	}
}
