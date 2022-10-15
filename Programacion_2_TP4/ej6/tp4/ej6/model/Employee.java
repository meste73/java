package tp4.ej6.model;

public class Employee extends Person {
	
	private int fileNumber;
	private double salary;
	
	public Employee(String name, String lname, int age, String post, int fileNumber, double salary) {
		super(name, lname, age, post);
		this.fileNumber = fileNumber;
		this.salary = salary;
	}

	public int getFileNumber() {
		return fileNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setFileNumber(int fileNumber) {
		this.fileNumber = fileNumber;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
