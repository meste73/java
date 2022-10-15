package tp4.ej2.model;

public class LightAlarm extends Alarm {
	
	private AlarmComponent light;
	
	public LightAlarm() {
		super();
		this.light = new AlarmComponent("Alarm bell");
	}
	
	private void lightOn() {
		this.light.componentOn();
	}
	
	public AlarmComponent getComponent() {
		return this.light;
	}
	
	public boolean checkSensor(int i) {
		if(getSensor(i).violationDetected()) {
			bellOn();
			lightOn();
			return true;
		}
		return false;
	}
	
	public boolean isComponentsOn() {
		if(this.light.isComponentOn()&&super.getComponent().isComponentOn()) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Alarm a = new LightAlarm();
		Sensor s1 = new Sensor("ventana");
		Sensor s2 = new Sensor("puerta");
		a.addSensor(s1);
		a.addSensor(s2);
		a.getSensor(1).setSensorState(false);
		a.alarmCheck();
		System.out.println(a.isComponentsOn());
		
	}
}
