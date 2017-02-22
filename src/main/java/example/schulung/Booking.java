package example.schulung;

import java.time.LocalDate;


public class Booking {
	
	private LocalDate bookingDate;
	private int numberOfPeople;
	
	public Booking(LocalDate bookingDate, int numberOfPeople) {
		setBookingDate(bookingDate);
		setNumberOfPeople(numberOfPeople);
	}
	
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	public int getNumberOfPeople() {
		return numberOfPeople;
	}
	
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	
}
