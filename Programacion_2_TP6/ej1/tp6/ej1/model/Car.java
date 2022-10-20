package tp6.ej1.model;

import java.time.LocalDate;

public class Car extends Item {
	
	private String brand;
	private String engineType;
	private String licensePlate;
	private double kms;	
	private boolean carRented;
	
	public Car(String brand, String engineType, String licensePlate, double kms) {
		super();
		this.brand = brand;
		this.engineType = engineType;
		this.licensePlate = licensePlate;
		this.kms = kms;
		this.carRented = false;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getEngineType() {
		return this.engineType;
	}
	
	public String getLicensePlate() {
		return this.licensePlate;
	}
	
	public double getKms() {
		return this.kms;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	public void setKms(double kms) {
		this.kms = kms;
	}
	
	public void rentItem(Client c, LocalDate expDate) {
		if((!carRented)&&(!c.hasRentedCar())) {
			setRentingExpDate(expDate);
			c.addRentedItem(this);
			this.carRented = true;
			c.setRentedCar(true);
		}
	}
	
}
