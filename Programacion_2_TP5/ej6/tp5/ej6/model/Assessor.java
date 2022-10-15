package tp5.ej6.model;

import java.util.ArrayList;

public class Assessor {
	
	private String name;
	private ArrayList<String> themes;
	private ArrayList<Job> jobs;
	
	public Assessor() {
		this("");
	}
	
	public Assessor(String name) {
		this.name = name;
		this.themes = new ArrayList<String>();
		this.jobs = new ArrayList<Job>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addTheme(String s) {
		this.themes.add(s);
	}
	
	public void removeTheme(String s) {
		this.themes.remove(s);
	}
	
	public void addJob(Job j) {
		this.jobs.add(j);
	}
	
	public void removeJob(Job j) {
		this.jobs.remove(j);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean hasTheme(String s) {
		return this.themes.contains(s);
	}
	
	public boolean hasThemes(ArrayList<String> themes) {
		return this.themes.containsAll(themes);
	}
	
	public int getJobsQuantity() {
		return this.jobs.size();
	}

}