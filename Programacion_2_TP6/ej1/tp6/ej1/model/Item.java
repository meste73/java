package tp6.ej1.model;

import java.time.LocalDate;
import java.time.Period;

public abstract class Item {
	
	private LocalDate rentingExpDate;
	
	public Item() {
		
	}
	
	public LocalDate getRentingExpDate() {
		return this.rentingExpDate;
	}
	
	public boolean isDateExpired() {
		Period p = Period.between(LocalDate.now(), rentingExpDate);
		if(p.getDays()+p.getMonths()+p.getYears() >= 0) {
			return false;
		}
		return true;
	}
	
	public void setRentingExpDate(LocalDate rentingExpDate) {
		this.rentingExpDate = rentingExpDate;
	}
	
	public abstract void rentItem(Client c, LocalDate expDate);
	
}
