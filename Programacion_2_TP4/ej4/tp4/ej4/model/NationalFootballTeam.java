package tp4.ej4.model;

import java.util.ArrayList;

public class NationalFootballTeam {
	
	private String countryName;
	private ArrayList<Person> teamMembers;
	
	public NationalFootballTeam(String countryName) {
		this.countryName = countryName;
		this.teamMembers = new ArrayList<Person>();		
	}
	
	public String getCountryName() {
		return this.countryName;
	}

	public void addTeamMember(Person p) {
		this.teamMembers.add(p);
	}
	
	public void removeTeamMember(Person p) {
		this.teamMembers.remove(p);
	}
	
	public void setCountryName(String name) {
		this.countryName = name;
	}
	
	public boolean isTeamMemberAvailable(Person p) {
		return p.isAvailable();
	}
	
	public boolean isTeamMemberInFlying(Person p) {
		return p.isInflying();
	}
	
	public boolean isTeamMemberInConcentration(Person p) {
		return p.isInConcentration();
	}
	
	public boolean isTeamMemberInOriginCountry(Person p) {
		return p.isInOriginCountry();
	}
	
}
