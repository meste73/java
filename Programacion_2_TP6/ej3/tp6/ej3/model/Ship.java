package tp6.ej3.model;

import tp6.ej2.model.OrderedElement;

public class Ship extends OrderedElement {
	
	private String name;
	private int capacity;

	public Ship(String name, int capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public void getLoad(Truck t) {
		//recibe la carga del camion t.
	}
	
	@Override
	public boolean isHigher(OrderedElement e) {
		return this.capacity > ((Ship) e).getCapacity();
	}
}
