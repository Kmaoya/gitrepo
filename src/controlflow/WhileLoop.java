package controlflow;

public class WhileLoop {
	
	//While loop is used in situations where we do not know how many times loop
	//needs to be executed beforehand
	//for loop is used where we already know about the number of times loop needs
	//to be executed>typically for a index used in interation.
	
	
	//While loop: pre condition check
	////while (condition){ ++}
	
	public static void main(String[] args) {
		
		int x = 45;
		int y = 20;
		
		//while(condition){ ++}
		
		while (x > 40) {
			System.out.println("We are learning while loop");
			x--;
			
			while (y < 25) {
				System.out.println("Nested while loop");
				y++;
				
			}
			
		}
	}

}
