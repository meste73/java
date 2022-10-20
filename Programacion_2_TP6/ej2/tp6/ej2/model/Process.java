package tp6.ej2.model;

public class Process extends OrderedElement {
	
	private int memory;
	private String name;
	
	public Process(int memory, String name) {
		this.memory = memory;
		this.name = name;
	}
	
	public int getMemory() {
		return this.memory;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public boolean isHigher(OrderedElement p) {
		return this.getMemory() > ((Process) p).getMemory();
	}
	
	@Override
	public String toString() {
		return "Proceso: " + this.getName() + "." + "\n" +
				"Memoria: " + this.memory;
	}
	
}
