package example.calculator;


public class Calculator {
	
	private Calculator() {
		
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return a + b
	 */
	public static double add(double a, double b) {
		return a+b;
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return a - b
	 */
	public static double subtract(double a, double b) {
		return a-b;
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return a * b
	 */
	public static double multiply(double a, double b) {
		return a*b;
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return a / b
	 */
	public static double divide(double a, double b) {
		return a / b;
	}

}
