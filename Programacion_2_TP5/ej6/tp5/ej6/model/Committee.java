package tp5.ej6.model;

import java.util.ArrayList;

public class Committee {
	
	private ArrayList<String> generalThemes;
	private ArrayList<String> expertThemes;
	private ArrayList<Job> jobs;
	private ArrayList<Assessor> assessors;
	
	public Committee() {
		this.generalThemes = new ArrayList<String>();
		this.expertThemes = new ArrayList<String>();
		this.jobs = new ArrayList<Job>();
		this.assessors = new ArrayList<Assessor>();
	}
	
	public void addGeneralThemes(String s) {
		this.generalThemes.add(s);
	}
	
	public void removeGeneralThemes(String s) {
		this.generalThemes.remove(s);
	}
	
	public void addExpertThemes(String s) {
		this.expertThemes.add(s);
	}
	
	public void removeExpertThemes(String s) {
		this.expertThemes.remove(s);
	}
	
	public void addJob(Job j) {
		this.jobs.add(j);
	}
	
	public void removeJob(Job j) {
		this.jobs.remove(j);
	}
	
	public void addAssessor(Assessor a) {
		this.assessors.add(a);
	}
	
	public void removeAssessor(Assessor a) {
		this.assessors.remove(a);
	}
	
	public void addAssesorToJob(Assessor s, Job j) {
		j.addAssessor(s);
	}
	
	public int getJobsAssessorQuantity(Assessor a) {
		return a.getJobsQuantity();
	}
	
	public boolean isAssessorExpert(Assessor a) {
		return a.hasThemes(this.expertThemes);
	}
}
