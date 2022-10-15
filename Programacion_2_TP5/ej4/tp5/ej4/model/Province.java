package tp5.ej4.model;

import java.util.ArrayList;

public class Province {
	
	private ArrayList<City> cities;
	private String provinceName;
	
	
	public Province(ArrayList<City> cities, String provinceName) {
		this.cities = cities;
		this.provinceName = provinceName;
	}
	
	public ArrayList<City> getCities(){
		return this.cities;
	}
	
	public String getProvinceName() {
		return this.provinceName;
	}
	
	public void setCities(ArrayList<City> cities) {
		this.cities = cities;
	}
	
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	
	public int getQuantityOfCitiesInDeficit(){
		return getCitiesInDeficit().size();
	}
	
	public ArrayList<City> getCitiesInDeficit() {
		ArrayList<City> citiesInDeficit = new ArrayList<City>();
		for(int i = 0; i < cities.size(); i++) {
			City city = this.cities.get(i);
			if((city.hasCityMoreCitizensThanLimit())&&(city.isCityInDeficit())) {
				citiesInDeficit.add(city);
			}
		}
		return citiesInDeficit;
	}
}
