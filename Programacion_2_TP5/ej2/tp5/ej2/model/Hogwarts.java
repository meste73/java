package tp5.ej2.model;

import java.util.ArrayList;

public class Hogwarts {
	
	private ArrayList<House> houses;
	private ArrayList<Student> students;
	
	public Hogwarts() {
		this.houses = new ArrayList<House>();
		this.students = new ArrayList<Student>();
	}
	
	public void addHouse(House h) {
		this.houses.add(h);
	}
	
	public void removeHouse(House h) {
		this.houses.remove(h);
	}
	
	private void addStudentToList(Student s) {
		if(!this.students.contains(s))
			this.students.add(s);
	}
	
	public void addStudentToHouse(Student s) {
		int i = 0;
		while(i < this.houses.size()) {
			if(this.houses.get(i).studentApprove(s)) {
				this.houses.get(i).addStudent(s);
				this.addStudentToList(s);
				break;
			}
			i++;
		}
	}
}
