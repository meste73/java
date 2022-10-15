package tp4.ej5.model;

import java.time.LocalDate;

public class Product {
	
	private String name;
	private LocalDate expirationDate;
	private int lotNumber;
	private LocalDate packagingDate;
	private String homeFarm;
	
	/**
	 * 
	 * @param name
	 * @param expirationDate
	 * @param lotNumber
	 * @param packagingDate
	 * @param homeFarm
	 */
	public Product(String name, LocalDate expirationDate, int lotNumber, LocalDate packagingDate, String homeFarm) {
		this.name = name;
		this.expirationDate = expirationDate;
		this.lotNumber = lotNumber;
		this.packagingDate = packagingDate;
		this.homeFarm = homeFarm;
	}
	
	public String getName() {
		return this.name;
	}
	
	public LocalDate getExpirationDate() {
		return this.expirationDate;
	}
	
	public int getLotNumber() {
		return this.lotNumber;
	}
	
	public LocalDate getPackagingDate() {
		return this.packagingDate;
	}
	
	public String getHomeFarm() {
		return this.homeFarm;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	public void setLotNumber(int lotNumber) {
		this.lotNumber = lotNumber;
	}
	
	public void setPackagingDate(LocalDate packagingDate) {
		this.packagingDate = packagingDate;
	}
	
	public void setHomeFarm(String homeFarm) {
		this.homeFarm = homeFarm;
	}
	
	public String toString() {
		return "Datos del producto:" + "\n" + "Nombre: " + this.getName() + "\n"
											+ "Fecha de vencimiento: " + this.getExpirationDate() + "\n"
											+ "Numero de lote: " + this.getLotNumber() + "\n"
											+ "Fecha de envasado: " + this.getPackagingDate() + "\n"
											+ "Lugar de origen: " + this.getHomeFarm() + "." + "\n";
	}
	
}
