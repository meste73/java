package tp4.ej6.model;

public class Person {
	
	private String name;
	private String lname;
	private int age;
	private String post;
	
	/**
	 * 
	 * @param name
	 * @param lname
	 * @param age
	 * @param post
	 */
	public Person(String name, String lname, int age, String post) {
		this.name = name;
		this.lname = lname;
		this.age = age;
		this.post = post;
	}

	public String getName() {
		return name;
	}

	public String getLname() {
		return lname;
	}

	public int getAge() {
		return age;
	}

	public String getPost() {
		return post;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPost(String post) {
		this.post = post;
	}
	
	public String toString() {
		return  "Cargo: " + this.getPost() + "\n"
				+ "Nombre: " + this.getName() + "\n"
				+ "Apellido: " + this.getLname() + "\n"
				+ "Edad: " + this.getAge() + "." + "\n" + "\n"
				;
	}
}
