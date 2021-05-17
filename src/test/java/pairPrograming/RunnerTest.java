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
	
	@Test
	public void dogoTest() {
		System.out.println(runner.doggo(5));
	
	}
	
	@Test
	public void goldyTest() {
		int[] chairs = {297,66,257,276,280,163,193,153,107,137,40,127,146,197,59,124,59,54,119,121,189,108,21,18,90,52,129,181,123,132};
		int[] temperature = {90,110,113,191,129,163,193,153,107,137,60,127,146,197,59,124,59,54,119,121,189,108,21,18,90,52,129,181,123,132};
 		System.out.println(runner.goldy(chairs, temperature));
	}
	
}
