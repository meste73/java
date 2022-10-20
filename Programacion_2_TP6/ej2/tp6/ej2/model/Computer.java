package tp6.ej2.model;

public class Computer extends OrderedElement {
	
	private String name;
	private int speed;
	
	
	public Computer(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public boolean isHigher(OrderedElement c) {
		return this.getSpeed() > ((Computer) c).getSpeed();
	}
	
	public void executeProcess(Process p) {
		System.out.println("Executando proceso" + p.toString());
	}
	
	public String toString() {
		return "Computadora: " + this.getName() + "." + "\n" + 
				"Velocidad: " + this.getSpeed();
	}
}
