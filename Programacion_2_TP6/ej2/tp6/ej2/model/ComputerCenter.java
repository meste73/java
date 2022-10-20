package tp6.ej2.model;

public class ComputerCenter {
	
	private OrderedQueue computers;
	private OrderedQueue proccesses;
	
	public ComputerCenter() {
		this.computers = new OrderedQueue();
		this.proccesses = new OrderedQueue();
	}
	
	public void addComputer(Computer c) {
		this.computers.addElement(c);
	}
	
	public void addProccess(Process p) {
		if(computers.hasElements()) {
			Computer c1 = (Computer) computers.getNextElement();
			c1.executeProcess(p);
		} else {
			proccesses.addElement(p);
		}
	}
	
}
