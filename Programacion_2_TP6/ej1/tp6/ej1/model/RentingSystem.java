package tp6.ej1.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class RentingSystem {
	
	private ArrayList<Item> items;
	private ArrayList<Client> clients;
	
	public RentingSystem() {
		this.items = new ArrayList<Item>();
		this.clients = new ArrayList<Client>();
	}
	
	public void addItem(Item i) {
		this.items.add(i);
	}
	
	public void addClient(Client c) {
		this.clients.add(c);
	}

	public Item getItemFromList(Item item) {
		for(int i = 0; i < this.items.size(); i++) {
			if(this.items.get(i).equals(item)) {
				return item;
			}
		}
		return null;
	}
	
	public void rentItem(Client c, Item i, LocalDate expDate) {
		if(this.items.contains(i)) {
			i = getItemFromList(i);
			i.rentItem(c, expDate);
			this.addClient(c);
		}
	}
	
	public ArrayList<Client> hasClientExpiredRent() {
		ArrayList<Client> rentExpClients = new ArrayList<Client>();
		for (int i = 0; i < this.clients.size(); i++) {
			if(this.clients.get(i).hasExpiredRent())
				rentExpClients.add(this.clients.get(i));
		}
		return rentExpClients;
	}

}
