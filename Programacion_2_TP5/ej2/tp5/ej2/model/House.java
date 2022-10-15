package tp5.ej2.model;

import java.util.ArrayList;

public class House {
	
	private String name;
	private ArrayList<String> attributes;
	private ArrayList<Student> students;
	private House enemyHouse;
	private int maxStudentsQuantity;
	
	public House() {
		this("", 0);
	}
	
	public House(String name, int maxStudents) {
		this.name = name;
		this.attributes = new ArrayList<String>();
		this.students = new ArrayList<Student>();
		this.enemyHouse = new House();
		this.maxStudentsQuantity = maxStudents;
	}
	
	public String getName() {
		return this.name;
	}
	
	public House getEnemyHouse() {
		return this.enemyHouse;
	}
	
	public int getMaxStudents() {
		return this.maxStudentsQuantity;
	}
	
	protected ArrayList<String> getAttributes(){
		return this.attributes;
	}
	
	protected ArrayList<Student> getStudents(){
		return this.students;
	}
	
	public void addAttribute(String attribute) {
		this.attributes.add(attribute);
	}
	
	public void removeAttribute(String attribute) {
		this.attributes.remove(attribute);
	}
	
	public void addStudent(Student s) {
		if((this.students.size()< maxStudentsQuantity) && this.studentApprove(s)) {
			this.students.add(s);
		}
	}
	
	public boolean studentApprove(Student s) {
		boolean approve = true;
		for(int i = 0; i < this.attributes.size(); i++) {
			if(!s.checkAttributeExistence(this.attributes.get(i))) {
				approve = false;
			}
		}
		return approve;
	}
	
	public void removeStudent(Student s) {
		this.students.remove(s);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEnemyHouse(House h) {
		if(!this.equals(h)) {
			this.enemyHouse = h;
		}
	}
	
	public void setMaxStudentsQuantity(int maxStudents) {
		this.maxStudentsQuantity = maxStudents;
	}
	
	public boolean equals(Object obj) {
		House h = (House) obj;
		return this.getName() == h.getName();
	}
	
	public boolean existStudentInHouse(Student s) {
		return this.students.contains(s);
	}
}
