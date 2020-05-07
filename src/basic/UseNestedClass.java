package basic;

public class UseNestedClass {
	
	//parent class
	
	
	public static void main(String[] args) {
		System.out.println(computer.name);
		computer.display();
	}

	public static class computer {
		//nested class/child class
		static String name = "Kazi";
		
		public static void display() {
		System.out.println("Display is good");
		
		}
		
		// public static void main(String[] args){
		
		
		}
	}


