package fixture.calculator;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import example.calculator.Calculator;

@RunWith(ConcordionRunner.class)
public class CalculatorSpecification {

	public int add(int firstValue, int secondValue) {
		return Calculator.add(firstValue, secondValue);
	}
	
}
