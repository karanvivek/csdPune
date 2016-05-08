package test.java;

import junit.framework.TestCase;

public class TestRPN extends TestCase {
	
	public void testCaseAddition() {
		String inputData = "1,2,+";
		RPNCalculator rpnCal = new RPNCalculator();
		int result = rpnCal.calculateRPN(inputData);
		assertEquals(3, result);
	}
	public void testCaseAddition1() {
		String inputData = "1,4,+";
		RPNCalculator rpnCal = new RPNCalculator();
		int result = rpnCal.calculateRPN(inputData);
		assertEquals(5, result);
	}

}
