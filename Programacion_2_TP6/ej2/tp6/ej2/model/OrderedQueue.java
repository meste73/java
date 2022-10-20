package tp6.ej2.model;

import java.util.ArrayList;

public class OrderedQueue {
	
	private ArrayList<OrderedElement> elements;
	
	public OrderedQueue() {
		this.elements = new ArrayList<>();
	}
	
	public void addElement(OrderedElement e) {
		boolean found = false;
		int i = 0;
		while((!found)&&(i < elements.size())) {
			if(elements.get(i).isHigher(e)) {
				i++;
			}
			found = true;
			if(found) {
				elements.add(i, e);
			} else {
				elements.add(e);
			}
		}
	}
	
	public boolean hasElements() {
		return elements.size() > 0;
	}
	
	public OrderedElement getNextElement() {
		OrderedElement next = elements.get(0);
		elements.remove(0);
		return next;
	}
}
