package math.operation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArithmeticOperationsTest {
	

	@Test
	public void testAdd()
	{	
		ArithmeticOperations operations = new ArithmeticOperations();
		Integer actual = operations.add(2, 6);
		Integer expected = 8;
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testSubtract()
	{	
		ArithmeticOperations operations = new ArithmeticOperations();
		Integer actual = operations.subtract(2, 2);
		Integer expected = 0;
		assertEquals(expected, actual);
		
	}
	
	
	@Test
	public void testMultiply()
	{	
		ArithmeticOperations operations = new ArithmeticOperations();
		Integer actual = operations.multiply(2, 6);
		Integer expected = 12;
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testDivide()
	{	
		ArithmeticOperations operations = new ArithmeticOperations();
		Integer actual = operations.divide(4, 2);
		Integer expected = 2;
		assertEquals(expected, actual);
		
	}

}
