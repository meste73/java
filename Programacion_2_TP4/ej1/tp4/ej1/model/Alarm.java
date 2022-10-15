package tp4.ej1.model;

public class Alarm {
	
	private boolean glassBroken;
	private boolean doorOpened;
	private boolean movementDetected;
	private AlarmBell bell;
	private AlarmLight light;
	
	public Alarm() {
		this.glassBroken = false;
		this.doorOpened = false;
		this.movementDetected = false;
		this.bell = new AlarmBell();
		this.light = new AlarmLight();
	}
	
	public boolean isGlassBroken() {
		return this.glassBroken;
	}
	
	public boolean isDoorOpened() {
		return this.doorOpened;
	}
	
	public boolean isMovementDetected() {
		return this.movementDetected;
	}
	
	public void setGlassBroken(boolean state) {
		this.glassBroken = state;
	}
	
	public void setDoorOpened(boolean state) {
		this.doorOpened = state;
	}
	
	public void setMovementDetected(boolean state) {
		this.movementDetected = state;
	}
	
	public void alarmCheck() {
		if(glassBroken||doorOpened||movementDetected) {
			this.bell.ringOn();
			this.light.lightOn();
		}
	}
}
