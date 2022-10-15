package tp4.ej5.model;

import java.time.LocalDate;

public class WaterFrozenProduct extends RefrigeratedProduct {
	
	private double saltWeight;
	
	/**
	 * 
	 * @param name
	 * @param expirationDate
	 * @param lotNumber
	 * @param packagingDate
	 * @param homeFarm
	 * @param alimSupOrgCode
	 * @param recomendedMaintTemp
	 * @param sw
	 */
	public WaterFrozenProduct(String name, LocalDate expirationDate, int lotNumber, LocalDate packagingDate, String homeFarm,
			int alimSupOrgCode, double recomendedMaintTemp, double sw) {
		super(name, expirationDate, lotNumber, packagingDate, homeFarm, alimSupOrgCode, recomendedMaintTemp);
		this.saltWeight = sw;
	}

	public double getSaltWeight() {
		return saltWeight;
	}

	public void setSaltWeight(double saltWeight) {
		this.saltWeight = saltWeight;
	}
	
	public String toString() {
		return "Datos del producto:" + "\n" + "Nombre: " + super.getName() + "\n"
											+ "Fecha de vencimiento: " + super.getExpirationDate() + "\n"
											+ "Numero de lote: " + super.getLotNumber() + "\n"
											+ "Fecha de envasado: " + super.getPackagingDate() + "\n"
											+ "Lugar de origen: " + super.getHomeFarm() + "\n"
											+ "Codigo de organismo de supervision alimentaria: " + super.getCode() + "\n"
											+ "Temperatura de mantenimiento recomendada: " + super.getTemp() + "\n"
											+ "Gramos de sal por litro de agua: " + this.getSaltWeight() + "." + "\n";
	}
	
}
