package tp5.ej5.model;

public class Employee {
	
	private String name;
	private String lname;
	private int dni;
	private double monthSalary;
	
	public Employee(String name, String lname, int dni, double monthSalary) {
		this.name = name;
		this.lname = lname;
		this.dni = dni;
		this.monthSalary = monthSalary;
	}

	public String getName() {
		return name;
	}

	public String getLname() {
		return lname;
	}

	public int getDni() {
		return dni;
	}

	public double getMonthSalary() {
		return monthSalary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public void setMonthSalary(double monthSalary) {
		this.monthSalary = monthSalary;
	}
	
	public double getFinalSalary() {
		return this.getMonthSalary();
	}
}
