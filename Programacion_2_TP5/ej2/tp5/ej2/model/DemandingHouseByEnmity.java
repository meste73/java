package tp5.ej2.model;

public class DemandingHouseByEnmity extends House {

	public DemandingHouseByEnmity(String name, int maxStudents) {
		super(name, maxStudents);
	}

	public void addStudent(Student s) {
		if ((super.getStudents().size() < super.getMaxStudents()) && super.studentApprove(s)
				&& (!super.getEnemyHouse().studentApprove(s))) {
			super.getStudents().add(s);
		}
	}

}
