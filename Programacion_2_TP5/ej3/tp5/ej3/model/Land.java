package tp5.ej3.model;

import java.util.ArrayList;

public class Land {
	
	private ArrayList<String> minerals;
	private double area;
	
	public Land(double area) {
		this.minerals = new ArrayList<String>();
		this.area = area;
	}
	
	public double getArea() {
		return this.area;
	}
	
	public void addMinerals(String mineral) {
		this.minerals.add(mineral);
	}
	
	public void removeMinerals(String mineral) {
		this.minerals.remove(mineral);
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public boolean checkMineralExistence(String mineral) {
		return this.minerals.contains(mineral);
	}
	
	public boolean canPlantCereal(Cereal c) {
		return c.canPlantInLand(this);
	}
}
