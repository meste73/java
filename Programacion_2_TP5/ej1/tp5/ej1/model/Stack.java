package tp5.ej1.model;

import java.util.ArrayList;

public class Stack {
	
	private ArrayList<Object> objects;
	
	public Stack() {
		this.objects = new ArrayList<Object>();
	}
	
	public void push(Object o) {
		this.objects.add(o);
	}
	
	public Object pop() {
		Object o = new Object();
		if(!this.objects.isEmpty()) {
			o = this.objects.get(this.objects.size()-1);
			this.objects.remove(this.objects.size()-1);
		}
		return o;
	}
	
	public String top() {
		String text = "";
		if(!this.objects.isEmpty()) {
			text = this.objects.get(this.objects.size()-1).toString();
		}
		return text;
	}
	
	public int size() {
		return this.objects.size();
	}
	
	public ArrayList<Object> copy(){
		ArrayList<Object> copy = this.objects;
		return copy;
	}
	
	public ArrayList<Object> reverse(){
		ArrayList<Object> copy = this.objects;
		for(int i = this.objects.size() - 1; i >= 0; i--) {
			copy.add(this.objects.get(i));
		}
		return copy;
	}
	
}
