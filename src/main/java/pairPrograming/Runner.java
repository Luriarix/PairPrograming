package pairPrograming;

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
	public void main(String[] args) {
	}
	
}
