package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		
		Calculator object = new Calculator();
		assertNotNull(object);
		assertTrue(object.getTotal() == 0);
	}

	@Test
	public void testGetTotal() {

		Calculator object = new Calculator();
		
		object.add(5);
		assertTrue(object.getTotal() == 5);   // total = 0 + 5
		
		object.divide(5);
		assertTrue(object.getTotal() == 1);  // total = 5 / 5
		
		object.multiply(10);
		assertTrue(object.getTotal() == 10); //total = 1 * 10
		
		object.subtract(3);
		assertTrue(object.getTotal() == 7);   //total = 10 - 3
		
	}

	@Test
	public void testAdd() {

		Calculator object = new Calculator();
		
		object.add(5);
		assertTrue(object.getTotal() == 5);   // total = 0 + 5
		
		object.add(25);
		assertTrue(object.getTotal() == 30);  //total = 5 + 25
		
	}

	@Test
	public void testSubtract() {
		Calculator object = new Calculator();
		
		object.add(100);
		object.subtract(25);
		
		assertTrue(object.getTotal() == 75);  //total = 100 - 25

		object.subtract(50);
		assertTrue(object.getTotal() == 25);  //total = 75 - 50
		
		
		object.subtract(25);
		assertTrue(object.getTotal() == 0);   // total = 25 - 25
		
		object.subtract(25);
		assertTrue(object.getTotal() == -25);  // total = 0 - 25
	}

	@Test
	public void testMultiply() {
		Calculator object = new Calculator();
		
		object.multiply(0);
		assertTrue(object.getTotal() == 0); //total = 0 * 0
		
		object.add(100);
		
		object. multiply(10);
		assertTrue(object.getTotal() == 100000);  //total = (100*100) * 10
		
		object.multiply(-1);
		assertTrue(object.getTotal() == -(100000*100000));  //total = (100000 * 100000) * -1 
			
		object.multiply(0);
		assertTrue(object.getTotal() == 0);   //total = 0
	}

	@Test
	public void testDivide() {
		Calculator object = new Calculator();
		
		object.add(1000);
		assertTrue(object.getTotal() == 1000);
		
		object.divide(0);
		assertTrue(object.getTotal() == 0);  // total = 1000 / 0 
		
		object.add(1000);
		object.divide(-1);
		
		assertTrue(object.getTotal() == -1000);  //total = 1000 / -1
		
		object.divide(-10);
		assertTrue(object.getTotal() == 100);    //total = -1000 / -10
		
		
	}

	@Test
	public void testGetHistory() {
Calculator object = new Calculator();
		
		object.add(4);
		object.subtract(2);
		object.multiply(2);
		object.add(5);
			
		
		assertTrue(object.getHistory().compareTo("0 + 4 - 2 * 2 + 5") == 0);
		
		object.divide(1);
		assertTrue(object.getHistory().compareTo("0 + 4 - 2 * 2 + 5 / 1") == 0);
	}

}
