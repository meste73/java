package tp4.ej2.model;

public class Sensor {
	
	private boolean sensorState;
	private String sensorName;
	
	public Sensor(String name) {
		this.sensorState = false;
		this.sensorName = name;
	}
	
	public String getSensorName() {
		return this.sensorName;
	}
	
	public void setSensorName(String name) {
		this.sensorName = name;
	}
	
	public void setSensorState(boolean state) {
		this.sensorState = state;
	}
	
	public boolean violationDetected() {
		return this.sensorState;
	}
}
