package basic.operators;

public class ConditionalOperators {
	// && Conditional ANd: all condition must have to be true
	// || Conditional OR: if one condition is true then block of code will execute
	
	// pipe ||
	
	public static void main(String[] args) {
		int number1=40;
		int number2=40;
		
		// == Equal
		// = Assignment
		if(number1==number2) {
			System.out.println("We love to eat Pizza");
		}
		
		
		
		if (number1 == 45 && number2==40) {
			System.out.println("We love to eat American Pizza");
			
		}
		if (number1 ==45 || number2 == 40) {
			System.out.println("We love to eat Italian Pizza");
			
		}
		
		}
	}


