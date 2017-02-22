package example.schulung;

import java.time.LocalDate;

public class Course {

	private LocalDate date;
	private String title;
	private double price;
	
	public Course(String title, LocalDate localDateTime, double price) {
		this.setDate(localDateTime);
		this.setTitle(title);
		this.setPrice(price);
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
