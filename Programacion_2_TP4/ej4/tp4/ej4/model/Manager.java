package tp4.ej4.model;

public class Manager extends Person {
	
	private int federationId;
	
	public Manager(String name, String lname, int passportNumber, int year, int month, int day, int id) {
		super(name, lname, passportNumber, year, month, day);
		this.federationId = id;
	}

	public int getFederationId() {
		return federationId;
	}

	public void setFederationId(int federationId) {
		this.federationId = federationId;
	}
	
}
