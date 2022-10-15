package tp4.ej5.model;

import java.util.ArrayList;

public class Poultry {
	
	private String poultryName;
	private ArrayList<Product> products;
	
	public Poultry(String name) {
		this.poultryName = name;
		this.products = new ArrayList<Product>();
	}
	
	public String getPoultryName() {
		return this.poultryName;
	}
	
	public void addProduct(Product p) {
		this.products.add(p);
	}
	
	public void removeProduct(Product p) {
		this.products.remove(p);
	}
	
	public void setPoultryName(String name) {
		this.poultryName = name;
	}
	
	public void printProductsInfo() {
		for(int i = 0; i < this.products.size(); i++) {
			System.out.println(this.products.get(i).toString());
		}
	}
}
