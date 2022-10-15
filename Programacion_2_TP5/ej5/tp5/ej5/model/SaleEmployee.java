package tp5.ej5.model;

import java.util.ArrayList;

public class SaleEmployee extends Employee {
	
	private ArrayList<Sale> sales;
	private double saleExtraPercent;
	
	public SaleEmployee(String name, String lname, int dni, double monthSalary, double saleExtraPercent) {
		super(name, lname, dni, monthSalary);
		this.sales = new ArrayList<Sale>();
		this.saleExtraPercent = saleExtraPercent;
	}
	
	public void addSale(Sale s) {
		this.sales.add(s);
	}
	
	public void removeSale(Sale s) {
		this.sales.remove(s);
	}
	
	protected ArrayList<Sale> getSales(){
		return this.sales;
	}
	
	public double getSaleExtraPercent() {
		return this.saleExtraPercent;
	}
	
	public void setSaleExtraPercent(double percent) {
		this.saleExtraPercent = percent;
	}
	
	public double getFinalSalary() {
		return getMonthSalary() + (this.getTotalSalarySales() * this.getSaleExtraPercent());
	}
	
	public double getTotalSalarySales() {
		double amount = 0;
		for(int i = 0; i < this.sales.size() ; i++) {
			amount += this.sales.get(i).getSaleAmount();
		}
		return amount;
	}
	
}
