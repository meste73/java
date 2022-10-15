package tp4.ej4.model;

import java.time.LocalDate;

public class Person {
	
	private String name;
	private String lname;
	private int passportNumber;
	private LocalDate birthDate;
	private boolean inflying;
	private boolean inConcentration;
	private boolean inOriginCountry;
	
	
	public Person(String name, String lname, int passportNumber, int year, int month, int day) {
		this.name = name;
		this.lname = lname;
		this.passportNumber = passportNumber;
		this.birthDate = LocalDate.of(year, month, day);
		this.inflying = false;
		this.inConcentration = false;
		this.inOriginCountry = true;
	}


	public String getName() {
		return name;
	}


	public String getLname() {
		return lname;
	}


	public int getPassportNumber() {
		return passportNumber;
	}


	public LocalDate getBirthDate() {
		return birthDate;
	}


	public boolean isInflying() {
		return inflying;
	}


	public boolean isInConcentration() {
		return inConcentration;
	}


	public boolean isInOriginCountry() {
		return inOriginCountry;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}


	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}


	public void setInflying(boolean inflying) {
		if(!this.inOriginCountry)
		this.inflying = inflying;
		else {
			this.inflying = false;
		}
	}


	public void setInConcentration(boolean inConcentration) {
		this.inConcentration = inConcentration;
	}


	public void setInOriginCountry(boolean inOriginCountry) {
		if(!this.inflying)
		this.inOriginCountry = inOriginCountry;
		else {
			this.inOriginCountry = false;
		}
	}
	
	public boolean isAvailable() {
		return (isInOriginCountry()&&!isInConcentration());
	}
}
