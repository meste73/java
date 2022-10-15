package tp5.ej3.model;

public class Grass extends Cereal {
	
	private int requirement;
	
	public Grass(String name, int requirement) {
		super(name);
		this.requirement = requirement;
	}
	
	public int getRequirement() {
		return this.requirement;
	}
	
	public void setRequirement(int req) {
		this.requirement = req;
	}
	
	public boolean checkRequirements(Land d, String mineral) {
		return (super.checkRequirements(d, mineral)&& this.getRequirement() < d.getArea());
	}
}
