package tp6.ej1.model;

import java.util.ArrayList;

public class Client {
	
	private String name;
	private String lname;
	private int dni;
	private boolean hasRentedCar;
	private ArrayList<Item> rentedItems;
	
	public Client(String name, String lname, int dni) {
		this.name = name;
		this.lname = lname;
		this.dni = dni;
		this.hasRentedCar = false;
		this.rentedItems = new ArrayList<Item>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getLname() {
		return this.lname;
	}
	
	public int getDni() {
		return this.dni;
	}
	
	public void addRentedItem(Item i) {
		this.rentedItems.add(i);
	}
	
	public void setRentedCar(boolean has) {
		this.hasRentedCar = has;
	}
	
	public boolean hasRentedCar() {
		return this.hasRentedCar;
	}
	
	public boolean hasExpiredRent() {
		int i = 0;
		while(i < this.rentedItems.size()) {
			if(this.rentedItems.get(i).isDateExpired())
				return true;
			i++;
		}
		return false;
	}
}
