package pairPrograming;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	
	
	public String factorial(int num) {
		int factorial = 2;
		int remainder = num;
		
		while (remainder / factorial != 1) {
			if (remainder % factorial != 0) {
				return "NONE";
			}
			remainder = remainder / factorial;
			factorial++;			
		}
		return Integer.toString(factorial) + '!';
	}
	
	public String doggo(int winner) {
		String positions = "";
		
		for (int i = 1; i <= 100; i++) {
			if(i == winner) {
				continue;
			}
			if ((i < 10 || i > 20) && (i % 10 == 1 || i % 10 == 2 || i % 10 == 3)) {
				if (i % 10 == 1) {
					positions += Integer.toString(i) + "st";
				} else if (i % 10 == 2) {
					positions += Integer.toString(i) + "nd";
				} else if (i % 10 == 3) {
					positions += Integer.toString(i) + "rd";
				}
				
			} else {
				positions += Integer.toString(i) + "th";
			}
			
			if (i != 100) {
				positions += ',';				
			}
		}
		return positions;
	}
	
	public List<Integer> goldy(int[] chair, int[] temerature) {
		List<Integer> possibleChairs = new ArrayList<>();
		int goldyWeight = 100;
		int goldyTemperature = 120;
		
		for (int i = 0; i < chair.length; i++) {
			if(goldyWeight <= chair[i] && goldyTemperature >= temerature[i]) {
				possibleChairs.add(i);
			}
		}
		return possibleChairs;
		
	}

	
}
