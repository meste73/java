package tp4.ej3.model;

import java.util.ArrayList;

public class Commission extends Employee {
	
	private int salesQuantity;
	private double salePercentage;
	private ArrayList<Sale> sales;
	
	public Commission(String name, int dni, double weekSalary, int salesQuantity, double salePercentage) {
		super(name,dni, weekSalary);
		this.salesQuantity = salesQuantity;
		this.salePercentage = salePercentage;
	}
	
	public int getSalesQuantity() {
		return this.salesQuantity;
	}
	
	public double getSalePercentage() {
		return this.salePercentage;
	}
	
	public void addSale(Sale s) {
		this.sales.add(s);
	}
	
	public void removeSale(Sale s) {
		this.sales.remove(s);
	}
	
	public void setSalesQuantity(int salesQuantity) {
		this.salesQuantity = salesQuantity;
	}
	
	public void setSalesPercentage(double salePercentage) {
		this.salePercentage = salePercentage;
	}
	
	public double salaryCalculator() {
		double salary = 0;
		for(int i = 0; i < this.sales.size(); i++) {
			salary += (this.sales.get(i).getValue()*this.salePercentage/100);
		}
		return getWeekSalary()+salary;
	}
}
