package example.schulung;

import java.time.LocalDate;


public class DiscountCalculation {
	
	private Course course;
	private Booking booking;
	
	private static final int MONTHS_BEFORE_BIG_DISCOUNT_ENDS = 2;
	private static final int MONTHS_BEFORE_SMALL_DISCOUNT_ENDS = 1;
	
	private static final double BIG_DISCOUNT = 0.2;
	private static final double SMALL_DISCOUNT = 0.1;
	private static final double VOLUME_DISCOUNT = 0.15;
	
	public DiscountCalculation(Course course, Booking booking) {
		setBooking(booking);
		setCourse(course);
	}
	
	public double calculatePriceToPay() {
		return course.getPrice() - earlyBirdDiscount()*course.getPrice() - volumeDiscount()*course.getPrice();
	}

	private double earlyBirdDiscount() {
		
		LocalDate deadlineBigDiscount = course.getDate().minusMonths(MONTHS_BEFORE_BIG_DISCOUNT_ENDS);
		//is the booking date before the deadline for the big discount?
		if (booking.getBookingDate().compareTo(deadlineBigDiscount) < 0) {
			return BIG_DISCOUNT;
		}
		
		LocalDate deadlineSmallDiscount = course.getDate().minusMonths(MONTHS_BEFORE_SMALL_DISCOUNT_ENDS);
		//is the booking date before the deadline for the big discount?
		if (booking.getBookingDate().compareTo(deadlineSmallDiscount) < 0) {
			return SMALL_DISCOUNT;
		}
		
		//no discount
		return 0.0;
	}
	
	private double volumeDiscount() {
		
		if (booking.getNumberOfPeople() >= 3) {
			return VOLUME_DISCOUNT;
		}
		
		//no discount
		return 0.0;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	

}
