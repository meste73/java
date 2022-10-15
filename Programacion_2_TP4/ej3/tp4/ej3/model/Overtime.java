package tp4.ej3.model;

public class Overtime extends Employee {
	
	private double extraHourAmount;
	private int extraHoursWorked;
	
	public Overtime(String name, int dni, double weekSalary, double extraHourAmount) {
		super(name,dni, weekSalary);
		this.extraHourAmount = extraHourAmount;
	}
	
	public double getExtraHourAmount() {
		return this.extraHourAmount;
	}
	
	public double getExtraHoursWorked() {
		return this.extraHoursWorked;
	}
	
	public void setExtraHourAmount(double amount) {
		this.extraHourAmount = amount;
	}
	
	public void addExtraHoursWorked(int hours) {
		for(int i = 0; i < hours; i++) {
			this.extraHoursWorked++;
		}
	}
	
	public double salaryCalculator() {
		return getWeekSalary()+(this.extraHourAmount*this.extraHoursWorked);		
	}
}
