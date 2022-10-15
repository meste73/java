package tp4.ej2.model;

public class AlarmComponent {
	
	private String nameComponent;
	private boolean componentOn;
	
	public AlarmComponent(String nameComponent) {
		this.nameComponent = nameComponent;
		this.componentOn = false;
	}
	
	public String getNameComponent() {
		return this.nameComponent;
	}
	
	public boolean isComponentOn() {
		return this.componentOn;
	}
	
	public void componentOn() {
		this.componentOn = true;
	}
}
