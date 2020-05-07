package basic;

public class UseVariable {
	
	// Variable: variable is a container which can hold value
	
	//Integer is a data type
	
	//DataType variableName = value;
	
	// Non static Global variable
	int x =5;
	int p =7;
	// class variable
	static int z=10;
	
	// Declare variable
	int a;
	
	
	//Declare and Initialize value
	
	int b=80;
	
	//Constant variable:
	String MAX_WIDTH="44";
	final String MIN_WIDTH="36";
	
	
	
	
	//variable type:
	 
	// Global variable
	
	//Local Variable
	
	/**
	 * Variable:
	 * Local Variable: inside of a method
	 * Global variable/Instance variable/ Reference variable : inside of a class but outside of method
	 * Class Variable: static keyword is used
	 */
	
	public static void main(String[] args) {
		// local variable
		int y=6;
		
		System.out.println(UseVariable.z);
		
		//Always Need to create a object then call it by object name
		
		// ClassName objectName = new constructorofClass();
		
		UseVariable obj= new UseVariable();
		
		obj.p=14;
		System.out.println(obj.p);// call by object name
		obj.p=33;
		System.out.println(obj.p);
		
		
		obj.MAX_WIDTH="46";
		System.out.println(obj.MAX_WIDTH);
		
		//obj.MIN_WIDTH="32"; //we can re-initialize
		
		
		
	}

}
