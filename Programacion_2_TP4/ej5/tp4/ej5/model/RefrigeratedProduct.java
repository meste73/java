package tp4.ej5.model;

import java.time.LocalDate;

public class RefrigeratedProduct extends Product {

	private int alimSupOrgCode;
	private double recomendedMaintTemp;
	
	/**
	 * 
	 * @param name
	 * @param expirationDate
	 * @param lotNumber
	 * @param packagingDate
	 * @param homeFarm
	 * @param alimSupOrgCode
	 * @param recomendedMaintTemp
	 */
	public RefrigeratedProduct(String name, LocalDate expirationDate, int lotNumber, LocalDate packagingDate,
			String homeFarm, int alimSupOrgCode, double recomendedMaintTemp) {
		super(name, expirationDate, lotNumber, packagingDate, homeFarm);
		this.alimSupOrgCode = alimSupOrgCode;
		this.recomendedMaintTemp = recomendedMaintTemp;
	}
	
	public int getCode() {
		return this.alimSupOrgCode;
	}
	
	public double getTemp() {
		return this.recomendedMaintTemp;
	}
	
	public void setCode(int code) {
		this.alimSupOrgCode = code;
	}
	
	public void setTemp(double temp) {
		this.recomendedMaintTemp = temp;
	}
	
	public String toString() {
		return "Datos del producto:" + "\n" + "Nombre: " + super.getName() + "\n"
											+ "Fecha de vencimiento: " + super.getExpirationDate() + "\n"
											+ "Numero de lote: " + super.getLotNumber() + "\n"
											+ "Fecha de envasado: " + super.getPackagingDate() + "\n"
											+ "Lugar de origen: " + super.getHomeFarm() + "\n"
											+ "Codigo de organismo de supervision alimentaria: " + this.getCode() + "\n"
											+ "Temperatura de mantenimiento recomendada: " + this.getTemp() + "." + "\n";
	}

}
