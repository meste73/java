package tp4.ej5.model;

import java.time.LocalDate;

public class NitrogenFrozenProduct extends RefrigeratedProduct {
	
	private String frozenInformation;
	private int nitrogenExpositionInSeconds;
	
	/**
	 * 
	 * @param name
	 * @param expirationDate
	 * @param lotNumber
	 * @param packagingDate
	 * @param homeFarm
	 * @param alimSupOrgCode
	 * @param recomendedMaintTemp
	 * @param info
	 * @param seconds
	 */
	public NitrogenFrozenProduct(String name, LocalDate expirationDate, int lotNumber, LocalDate packagingDate, String homeFarm,
			int alimSupOrgCode, double recomendedMaintTemp, String info, int seconds) {
		super(name, expirationDate, lotNumber, packagingDate, homeFarm, alimSupOrgCode, recomendedMaintTemp);
		this.frozenInformation = info;
		this.nitrogenExpositionInSeconds = seconds;
	}

	public String getFrozenInformation() {
		return frozenInformation;
	}

	public int getNitrogenExpositionInSeconds() {
		return nitrogenExpositionInSeconds;
	}

	public void setFrozenInformation(String frozenInformation) {
		this.frozenInformation = frozenInformation;
	}

	public void setNitrogenExpositionInSeconds(int nitrogenExpositionInSeconds) {
		this.nitrogenExpositionInSeconds = nitrogenExpositionInSeconds;
	}
	
	public String toString() {
		return "Datos del producto:" + "\n" + "Nombre: " + super.getName() + "\n"
											+ "Fecha de vencimiento: " + super.getExpirationDate() + "\n"
											+ "Numero de lote: " + super.getLotNumber() + "\n"
											+ "Fecha de envasado: " + super.getPackagingDate() + "\n"
											+ "Lugar de origen: " + super.getHomeFarm() + "\n"
											+ "Codigo de organismo de supervision alimentaria: " + super.getCode() + "\n"
											+ "Temperatura de mantenimiento recomendada: " + super.getTemp() + "\n"
											+ "Metodo de congelacion: " + this.frozenInformation + "\n"
											+ "Tiempo de exposicion al nitrogeno: " + this.getNitrogenExpositionInSeconds() + " seconds." + "\n";
	}
	
}
