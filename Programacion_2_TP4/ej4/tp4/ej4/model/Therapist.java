package tp4.ej4.model;

public class Therapist extends Person {
	
	private String title;
	private int yearsOnProfession;
	
	public Therapist(String name, String lname, int passportNumber, int year, int month, int day, int years) {
		super(name, lname, passportNumber, year, month, day);
		this.yearsOnProfession = years;
	}

	public String getTitle() {
		return title;
	}

	public int getYearsOnProfession() {
		return yearsOnProfession;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setYearsOnProfession(int yearsOnProfession) {
		this.yearsOnProfession = yearsOnProfession;
	}
	
}
