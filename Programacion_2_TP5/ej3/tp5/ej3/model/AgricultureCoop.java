package tp5.ej3.model;

import java.util.ArrayList;

public class AgricultureCoop {
	
	private ArrayList<Land> lands;
	private ArrayList<Cereal> cereals;
	private ArrayList<String> importantMinerals;
	
	public AgricultureCoop() {
		this.lands = new ArrayList<Land>();
		this.cereals = new ArrayList<Cereal>();
		this.importantMinerals = new ArrayList<String>();
	}
	
	public void addLand(Land l) {
		this.lands.add(l);
	}
	
	public void removeLand(Land l) {
		this.lands.remove(l);
	}
	
	public void addCereal(Cereal c) {
		this.cereals.add(c);
	}
	
	public void removeCereal(Cereal c) {
		this.cereals.remove(c);
	}
	
	public void addImportantMineral(String mineral) {
		this.importantMinerals.add(mineral);
	}
	
	public void removeImportantMineral(String mineral) {
		this.importantMinerals.remove(mineral);
	}
	
	public boolean isASpecialLand(Land d) {
		boolean response = true;
		for(int i = 0; i < this.importantMinerals.size(); i++) {
			if(!d.checkMineralExistence(this.importantMinerals.get(i))) {
				response = false;
			}
		}
		return response;
	}

}
