package tp5.ej4.model;

import java.util.ArrayList;

public class OtherTaxPayer extends TaxPayer {
	
	private ArrayList<Double> entries;
	private double fixedAmountPercent;
	private double receiptPercent;
	
	public OtherTaxPayer(String name, int taxId, double amount, double fixedAmountPercent, double receiptPercent) {
		super(name, taxId, amount);
		this.entries = new ArrayList<Double>();
		this.fixedAmountPercent = fixedAmountPercent;
		this.receiptPercent = receiptPercent;
	}
	
	public double getFixedAmountPercent() {
		return this.fixedAmountPercent;
	}
	
	public double getReceiptPercent() {
		return this.receiptPercent;
	}
	
	public void addSale(Double d) {
		this.entries.add(d);
	}
	
	public void removeSale(Double d) {
		this.entries.remove(d);
	}
	
	public void setFixedAmountPercent(double d) {
		this.fixedAmountPercent = d;
	}
	
	public void setReceiptPercent(double d) {
		this.receiptPercent = d;
	}
	
	public double getTaxAmount() {
		return super.getAmount() * fixedAmountPercent + getSalesAmountPercent();
	}
	
	public double getSalesAmountPercent() {
		double amount = 0;
		for(int i = 0; i < this.entries.size(); i++) {
			amount += this.entries.get(i);
		}
		return amount * receiptPercent;
	}
}
