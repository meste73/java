package tp5.ej6.model;

import java.util.ArrayList;

public class Job {
	
	private ArrayList<String> themes;
	private Assessor assessor;
	
	public Job() {
		this.themes = new ArrayList<String>();
		this.assessor = new Assessor();
	}
	
	public void addTheme(String s) {
		this.themes.add(s);
	}
	
	public void removeTheme(String s) {
		this.themes.remove(s);
	}
	
	public void addAssessor(Assessor a) {
		if(this.reachRequirement(a)) {
			this.assessor = a;
		}
	}
	
	public Assessor getAssessor() {
		return this.assessor;
	}
	
	protected ArrayList<String> getThemes(){
		return this.themes;
	}
	
	public boolean reachRequirement(Assessor a) {
		return a.hasThemes(this.themes);
	}
}
