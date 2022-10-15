package tp5.ej4.model;

import java.util.ArrayList;

public class Country {
	
	private String countryName;
	private ArrayList<Province> provinces;
	
	public Country(ArrayList<Province> provinces, String countryName) {
		this.provinces = provinces;
		this.countryName = countryName;
	}
	
	public String getCountryName() {
		return this.countryName;
	}
	
	public ArrayList<Province> getProvinces(){
		return this.provinces;
	}
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public void setProvinces(ArrayList<Province> provinces) {
		this.provinces = provinces;
	}
	
	public ArrayList<Province> getProvincesWithHalfQuantityOfCitiesInDeficit(){
		ArrayList<Province> provincesReturn = new ArrayList<Province>();
		for(int i = 0; i < this.provinces.size(); i++) {
			Province prov = this.provinces.get(i);
			if(prov.getQuantityOfCitiesInDeficit() > prov.getCities().size()/2) {
				provincesReturn.add(prov);
			}
		}
		return provincesReturn;
	}
}
