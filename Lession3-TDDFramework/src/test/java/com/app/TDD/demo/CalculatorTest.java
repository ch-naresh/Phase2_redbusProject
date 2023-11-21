package com.app.TDD.demo;

public class CalculatorTest {

	
	Calculator calculator = new Calculator();
	
	public void testAdd() {
		
		
		int a =5;
		int b = 7;
		
		int result = calculator.add(a,b);
		
		//assert
		Assert.assertEquals(result,12,"Addition result is incorrect");
	}
}
