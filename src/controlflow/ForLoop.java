package controlflow;

public class ForLoop {
	
	// Loop is allowing us to execute a statement or group of statements multiple
	// times
	// for loop
	// while loop
	//Do.. white loop
	// For Each loop

	public static void main(String[] args) {

		System.out.println("Hello world");
//for loop
		//for(Declaration: Expression){ // statements
		//for(initialization; condition;ITERATION){}
		//Initialization=StartPoint; condition =EndPoint
		
	//	for (Int i = 0; i < 10; i++) {
	//		System.out.println("We are learning for loop");
			
	//	}
		
		
		//Nested for loop
		
		for (int i = 0; i <=3; i++) {
			// parent for loop
			System.out.println("We are learning Nested for loop");
			// child for loop
			for (int j = 0; j < 2; j++) {
				System.out.println("Nested loop");
			}
		}
	}

}
