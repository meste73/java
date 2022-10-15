package tp4.ej4.model;

public class FootballPlayer extends Person {

	private String position;
	private String skillFulFeet;
	private int goalsQuantity;

	public FootballPlayer(String name, String lname, int passportNumber, int year, int month, int day, String position,
			String skillFulFeet, int goalsQuantity) {
		super(name, lname, passportNumber, year, month, day);
		this.position = position;
		this.skillFulFeet = skillFulFeet;
		this.goalsQuantity = goalsQuantity;
	}

	public String getPosition() {
		return position;
	}

	public String getSkillFulFeet() {
		return skillFulFeet;
	}

	public int getGoalsQuantity() {
		return goalsQuantity;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setSkillFulFeet(String skillFulFeet) {
		this.skillFulFeet = skillFulFeet;
	}

	public void setGoalsQuantity(int goalsQuantity) {
		this.goalsQuantity = goalsQuantity;
	}
	
}
