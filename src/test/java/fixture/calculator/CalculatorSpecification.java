package fixture.calculator;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import example.calculator.Calculator;

@RunWith(ConcordionRunner.class)
public class CalculatorSpecification {

	public double add(double firstValue, double secondValue) {
		return Calculator.add(firstValue, secondValue);
	}
	

	public double subtract(double firstValue, double secondValue) {
		return Calculator.subtract(firstValue, secondValue);
	}
	

	public double multiply(double firstValue, double secondValue) {
		return Calculator.multiply(firstValue, secondValue);
	}
	

	public double divide(double firstValue, double secondValue) {
		return Calculator.divide(firstValue, secondValue);
	}
	
}
