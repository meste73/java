package tp6.ej3.model;

import tp6.ej2.model.OrderedQueue;

public class Port {
	
	private OrderedQueue ships;
	private OrderedQueue trucks;
	private boolean downloading;
	
	public Port() {
		this.ships = new OrderedQueue();
		this.trucks = new OrderedQueue();
		this.downloading = false;
	}
	
	public boolean isDownloading() {
		return this.downloading;
	}

	public void addShip(Ship s) {
		ships.addElement(s);
	}
	
	public void downloadTruck(Truck t) {
		if((ships.hasElements())&&(!downloading)) {
			Ship s1 = (Ship) ships.getNextElement();
			s1.getLoad(t);
		} else {
			trucks.addElement(t);
		}
	}
}
