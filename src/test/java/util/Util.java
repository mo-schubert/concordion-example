package util;

import java.time.LocalDate;


public class Util {
	
	/**
	 * String format: day.month.year
	 * @return
	 */
	public static LocalDate getDateFromString(String dateAsString) {
		String[] dateInParts = dateAsString.split("\\.");
		
		int day = Integer.parseInt(dateInParts[0]);
		int month = Integer.parseInt(dateInParts[1]);
		int year = Integer.parseInt(dateInParts[2]);
	
		LocalDate date = LocalDate.of(year, month, day);
        
        return date;
    }
	
	
}
