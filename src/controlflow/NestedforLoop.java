package controlflow;

import  java.util.Scanner;

public class NestedforLoop {
	
	//user will give the number and it will print as a row basic
	
	//output
	//1
	//1 2
	//1 2 3
	//1 2 3 4
	//1 2 3 4 5
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Number");
		
		int numOfRow = input.nextInt();
		
		// i will work as column wise
		for (int i = 1; i <= numOfRow; i++) {
			
			// j will work as row wise
			for (int j = 1; j <= i; j++) {
				System.out.println(j + " ");
				
			}
			
			System.out.println();
		}
				
	}

}
