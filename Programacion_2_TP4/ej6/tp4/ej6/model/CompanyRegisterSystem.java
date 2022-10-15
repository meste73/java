package tp4.ej6.model;

import java.util.ArrayList;

public class CompanyRegisterSystem {
	
	private String companyName;
	private ArrayList<Person> partners;
	
	public CompanyRegisterSystem(String name) {
		this.companyName = name;
		this.partners = new ArrayList<Person>();
	}
	
	public String getName() {
		return this.companyName;
	}
	
	public void addPartner(Person p) {
		this.partners.add(p);
	}
	
	public void removePartner(Person p) {
		this.partners.remove(p);
	}
	
	public void setName(String name) {
		this.companyName = name;
	}
	
	public String partnersInfoList() {
		String list = "";
		for(int i = 0; i < this.partners.size(); i++) {
			list += this.partners.get(i).toString();
		}
		return list;
	}
}
