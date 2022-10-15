package tp5.ej3.model;

import java.util.ArrayList;

public class Cereal {
	
	private String name;
	private ArrayList<String> minerals;
	
	public Cereal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addMineral(String mineral) {
		this.minerals.add(mineral);
	}
	
	public void removeMineral(String mineral) {
		this.minerals.remove(mineral);
	}
	
	public boolean canPlantInLand(Land d) {
		boolean response = true;
		for(int i = 0; i < this.minerals.size(); i++) {
			if(!checkRequirements(d, this.minerals.get(i))) {
				response = false;
			}
		}
		return response;
	}
	
	public boolean checkRequirements(Land d, String mineral) {
		return (d.checkMineralExistence(mineral));
	}
}
