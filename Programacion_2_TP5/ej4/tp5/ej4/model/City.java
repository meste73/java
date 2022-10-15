package tp5.ej4.model;

import java.util.ArrayList;

public class City {
	
	private String cityName;
	private int citizens;
	private double mantExpenses;
	private ArrayList<TaxPayer> taxPayers;
	
	private static int quantityInhabitantsLimit = 100000;
	
	public City(String cityName, int citizens, double mantExpenses) {
		
		this.cityName = cityName;
		this.citizens = citizens;
		this.mantExpenses = mantExpenses;
		this.taxPayers = new ArrayList<TaxPayer>();
	}
	
	public String getCityName() {
		return this.cityName;
	}

	public int getInhabitants() {
		return citizens;
	}

	public double getMantExpenses() {
		return mantExpenses;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public void setInhabitants(int citizens) {
		this.citizens = citizens;
	}

	public void setMantExpenses(double mantExpenses) {
		this.mantExpenses = mantExpenses;
	}

	public boolean isCityInDeficit() {
		return (getTaxPayersTotalAmount() < this.mantExpenses );
	}
	
	public double getTaxPayersTotalAmount(){
		double amount = 0;
		for(int i = 0; i < this.taxPayers.size(); i++) {
			amount += this.taxPayers.get(i).getTaxAmount();
		}
		return amount;
	}
	
	public boolean hasCityMoreCitizensThanLimit() {
		return this.citizens > quantityInhabitantsLimit;
	}
}
