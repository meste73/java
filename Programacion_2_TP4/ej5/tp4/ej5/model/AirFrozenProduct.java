package tp4.ej5.model;

import java.time.LocalDate;

public class AirFrozenProduct extends RefrigeratedProduct {
	
	private double nitrogenPercent;
	private double oxygenPercent;
	private double carbonDioxidePercent;
	private double steamPercent;
	
	/**
	 * 
	 * @param name
	 * @param expirationDate
	 * @param lotNumber
	 * @param packagingDate
	 * @param homeFarm
	 * @param alimSupOrgCode
	 * @param recomendedMaintTemp
	 * @param np
	 * @param op
	 * @param cdp
	 * @param sp
	 */
	public AirFrozenProduct(String name, LocalDate expirationDate, int lotNumber, LocalDate packagingDate, String homeFarm,
			int alimSupOrgCode, double recomendedMaintTemp, double np, double op, double cdp, double sp) {
		super(name, expirationDate, lotNumber, packagingDate, homeFarm, alimSupOrgCode, recomendedMaintTemp);
		this.nitrogenPercent = np;
		this.oxygenPercent = op;
		this.carbonDioxidePercent = cdp;
		this.steamPercent = sp;
	}

	public double getNitrogenPercent() {
		return nitrogenPercent;
	}

	public double getOxygenPercent() {
		return oxygenPercent;
	}

	public double getCarbonDioxidePercent() {
		return carbonDioxidePercent;
	}

	public double getSteamPercent() {
		return steamPercent;
	}

	public void setNitrogenPercent(double nitrogenPercent) {
		this.nitrogenPercent = nitrogenPercent;
	}

	public void setOxygenPercent(double oxygenPercent) {
		this.oxygenPercent = oxygenPercent;
	}

	public void setCarbonDioxidePercent(double carbonDioxidePercent) {
		this.carbonDioxidePercent = carbonDioxidePercent;
	}

	public void setSteamPercent(double steamPercent) {
		this.steamPercent = steamPercent;
	}
	
	public String toString() {
		return "Datos del producto:" + "\n" + "Nombre: " + super.getName() + "\n"
											+ "Fecha de vencimiento: " + super.getExpirationDate() + "\n"
											+ "Numero de lote: " + super.getLotNumber() + "\n"
											+ "Fecha de envasado: " + super.getPackagingDate() + "\n"
											+ "Lugar de origen: " + super.getHomeFarm() + "\n"
											+ "Codigo de organismo de supervision alimentaria: " + super.getCode() + "\n"
											+ "Temperatura de mantenimiento recomendada: " + super.getTemp() + "\n"
											+ "Porcentaje de nitrogeno: " + this.getNitrogenPercent() + "\n"
											+ "Porcentaje de oxigeno: " + this.getOxygenPercent() + "\n"
											+ "Porcentaje de dioxido de carbono: " + this.getCarbonDioxidePercent() + "\n"
											+ "Porcentaje de valor de agua: " + this.getSteamPercent() + "." + "\n";
	}
	
}
