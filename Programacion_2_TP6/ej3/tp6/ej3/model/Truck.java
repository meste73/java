package tp6.ej3.model;

import java.time.LocalDate;
import java.time.Period;

import tp6.ej2.model.OrderedElement;

public class Truck extends OrderedElement {
	
	private String name;
	private LocalDate loaded;

	public Truck(String name, LocalDate loaded) {
		super();
		this.name = name;
		this.loaded = loaded;
	}
	
	public String getName() {
		return this.name;
	}
	
	public LocalDate getDate() {
		return this.loaded;
	}

	@Override
	public boolean isHigher(OrderedElement e) {
		return isDateOlder(e);
	}
	
	public boolean isDateOlder(OrderedElement e) {
		LocalDate dAux = ((Truck)e).getDate();
		Period p = Period.between(dAux, loaded);
		return ((p.getYears()< 0)&&(p.getMonths()<0)&&(p.getDays()<0));
	}

}
