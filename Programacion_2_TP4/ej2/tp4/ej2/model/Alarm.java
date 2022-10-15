package tp4.ej2.model;

import java.util.ArrayList;

public class Alarm {

	private ArrayList<Sensor> sensors;
	private AlarmComponent bell;
	
	public Alarm() {
		this.sensors = new ArrayList<Sensor>();
		this.bell = new AlarmComponent("Alarm bell");
	}
	
	public Sensor getSensor(int i) {
		return this.sensors.get(i);
	}
	
	public AlarmComponent getComponent() {
		return this.bell;
	}
	
	public boolean isComponentsOn() {
		if(this.getComponent().isComponentOn()) {
			return true;
		}
		return false;
	}

	public void addSensor(Sensor s) {
		this.sensors.add(s);
	}

	public void removeSensor(Sensor s) {
		this.sensors.remove(s);
	}

	protected void bellOn() {
		this.bell.componentOn();
	}
	
	public void alarmCheck() {
		int i = 0;
		while(i < this.sensors.size()) {
			if(checkSensor(i))
			i = this.sensors.size();
			i++;
		}
	};
	
	public boolean checkSensor(int i) {
		if(getSensor(i).violationDetected()) {
			bellOn();
			return true;
		}
		return false;
	}
	
}
