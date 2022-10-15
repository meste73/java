package tp5.ej2.model;

public class DemandingHouseByLineage extends House {
	
	public DemandingHouseByLineage(String name, int maxStudents) {
		super(name, maxStudents);
	}
	
	@Override
	public void addStudent(Student s) {
		if((getStudents().size()< getMaxStudents()) && studentApprove(s) && studentFamilyInSchool(s)) {
			getStudents().add(s);
		}
	}
	
	public boolean studentFamilyInSchool(Student s) {
		return getStudents().contains(s);
	}
}
