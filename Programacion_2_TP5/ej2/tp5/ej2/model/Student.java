package tp5.ej2.model;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private int dni;
	private ArrayList<String> attributes;
	private ArrayList<Student> familyInSchool;
	
	public Student(String name) {
		this.name = name;
		this.attributes = new ArrayList<String>();
		this.familyInSchool = new ArrayList<Student>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getDni() {
		return this.dni;
	}
	
	public void addAttribute(String attribute) {
		this.attributes.add(attribute);
	}
	
	public void removeAttribute(String attribute) {
		this.attributes.remove(attribute);
	}
	
	public void addFamilyInSchool(Student s) {
		this.familyInSchool.add(s);
	}
	
	public void removeFamilyInSchool(Student s) {
		this.familyInSchool.remove(s);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public boolean checkAttributeExistence(String attribute) {
		return this.attributes.contains(attribute);
	}
	
	public boolean isFamily(Student s) {
		return this.familyInSchool.contains(s);
	}
	
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		return this.dni == s.dni;
	}
	
}
