package tp4.ej1.model;

public class AlarmBell {
	
	private boolean ringOn;
	
	public AlarmBell() {
		this.ringOn = false;
	}
	
	public boolean getRingOn() {
		return this.ringOn;
	}
	
	public void ringOn() {
		this.ringOn = true;
	}
}
