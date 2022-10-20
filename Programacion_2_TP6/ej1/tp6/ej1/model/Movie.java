package tp6.ej1.model;

import java.time.LocalDate;

public class Movie extends Item {
	
	private String title;
	private String genre;
	private String description;
	private double duration;
	private int quantity;
	
	private static int limit = 0;
	
	public Movie(String title, String genre, String description, double duration, int quantity) {
		super();
		this.title = title;
		this.genre = genre;
		this.description = description;
		this.duration = duration;
		this.quantity = quantity;
	}
	
	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public String getDescription() {
		return description;
	}

	public double getDuration() {
		return duration;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void rentItem(Client c, LocalDate expDate) {
		if(this.quantity > limit) {
			setRentingExpDate(expDate);
			setQuantity(this.quantity-1);
			c.addRentedItem(this);
		}
	}
	
}
