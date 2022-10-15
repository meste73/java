package tp4.ej6.model;

public class FinalUser extends Person {
	
	private String userName;
	private String password;
	
	public FinalUser(String name, String lname, int age, String post, String userName, String password) {
		super(name, lname, age, post);
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
