package pairPrograming;

import static org.junit.Assert.*;

import org.junit.Test;


public class RunnerTest {
	private Runner runner = new Runner();
	
	@Test
	public void factorialTest() {
		assertEquals("5!", runner.factorial(120));
		assertEquals("NONE", runner.factorial(150));
		assertEquals("10!", runner.factorial(3628800));
		assertEquals("12!", runner.factorial(479001600));
		assertEquals("3!", runner.factorial(6));
		assertEquals("NONE", runner.factorial(18));
	}
	
	
}
