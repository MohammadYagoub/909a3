package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		
		assertNotNull(calc); //test if object is not null
	}

	
	@Test
	public void testGetTotal() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal()); //test if get total is returning the correct value
	}
	
	@Test 
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(3); //add 3 to total
		assertEquals(3, calc.getTotal()); //test if total is updated correctly
	}
	
	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		calc.subtract(3); //subtract 3 from total
		assertEquals(-3, calc.getTotal()); //test if total is updated correctly
	}
	
	@Test
	public void testMultiply () {
		Calculator calc = new Calculator();
		calc.add(3); //add 3 to total
		calc.multiply(3); //multiply total by 3
		assertEquals(9, calc.getTotal()); //test if total is updated correctly
	}
	
	@Test
	public void testDivideByNonZero () {
		Calculator calc = new Calculator();
		calc.subtract(3); //subtract 3 from total
		calc.divide(3); //divide total by 3
		assertEquals(-1, calc.getTotal()); //test if total is updated correctly
	}
	
	@Test
	public void testDivideByZero () {
		Calculator calc = new Calculator();
		calc.subtract(3); //subtract 3 from total
		calc.divide(0); //divide total by 0
		assertEquals(0, calc.getTotal()); //test if total is updated correctly
	}
	
	@Test
	public void testGetHistory () {
		Calculator calc = new Calculator();
		assertEquals("", calc.getHistory());
	}
}
