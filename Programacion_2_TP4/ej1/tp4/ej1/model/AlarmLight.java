package tp4.ej1.model;

public class AlarmLight {
	
	private boolean lightOn;
	
	public AlarmLight() {
		this.lightOn = false;
	}
	
	public boolean isLightOn() {
		return this.lightOn;
	}
	
	public void lightOn() {
		this.lightOn = true;
	}
}
