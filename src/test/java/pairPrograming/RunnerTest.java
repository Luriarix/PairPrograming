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
		String allDogs = "1st,2nd,3rd,4th,5th,6th,7th,8th,9th,10th,11th,12th,13th,14th,15th,16th,17th,18th,19th,20th,21st,22nd,23rd,24th,25th,26th,27th,28th,29th,30th,31st,32nd,33rd,34th,35th,36th,37th,38th,39th,40th,41st,42nd,43rd,44th,45th,46th,47th,48th,49th,50th,51st,52nd,53rd,54th,55th,56th,57th,58th,59th,60th,61st,62nd,63rd,64th,65th,66th,67th,68th,69th,70th,71st,72nd,73rd,74th,75th,76th,77th,78th,79th,80th,81st,82nd,83rd,84th,85th,86th,87th,88th,89th,90th,91st,92nd,93rd,94th,95th,96th,97th,98th,99th,100th";
		assertEquals(allDogs.replace(",5th,", ","), runner.doggo(5));	
	}
	
	@Test
	public void goldyTest() {
		int[] chairs = {297,66,257,276,280,163,193,153,107,137,40,127,146,197,59,124,59,54,119,121,189,108,21,18,90,52,129,181,123,132};
		int[] temperature = {90,110,113,191,129,163,193,153,107,137,60,127,146,197,59,124,59,54,119,121,189,108,21,18,90,52,129,181,123,132};
 		
		System.out.println(runner.goldy(chairs, temperature));
	}
	
	
	
}
