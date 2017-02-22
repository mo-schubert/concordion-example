package fixture.schulung;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import util.Util;
import example.schulung.Booking;
import example.schulung.Course;
import example.schulung.DiscountCalculation;

@RunWith(ConcordionRunner.class)
public class DiscountSpecification {

    public double calculatePriceToPay(double coursePrice, String courseDate, int numberOfPeople, String bookingDate) {
    	Course course = new Course("test", Util.getDateFromString(courseDate), coursePrice);
    	Booking booking = new Booking(Util.getDateFromString(bookingDate), numberOfPeople);
    	
    	DiscountCalculation discountCalculation = new DiscountCalculation(course, booking);
    	return discountCalculation.calculatePriceToPay();
    }

	
}
