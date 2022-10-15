package tp4.ej3.model;

public class Sale {
	
	private String saleName;
	private double saleValue;
	
	public Sale(String name, double value) {
		this.saleName = name;
		this.saleValue = value;
	}
	
	public String getName() {
		return this.saleName;
	}
	
	public double getValue() {
		return this.saleValue;
	}
	
	public void setName(String name) {
		this.saleName = name;
	}
	
	public void setValue(double value) {
		this.saleValue = value;
	}
}
