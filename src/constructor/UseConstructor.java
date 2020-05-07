package constructor;

public class UseConstructor {

	// Constructor Name will be same as class name
//constructor has no return type
	//constructor are used to initialize the object
	//before creating parameterize constructor we must have to create default constructor
	
	//default/ non parameterized constructor
	//parameterize constructor
	
	//AccessModifier className() {}
	
	//declare variable
	
	//Global variable is inside of a class not inside of method
	String name;
	String address;
	int id;
	
	public UseConstructor() {
		//default constructor
		System.out.println("Hello World");
		
	}
	//local variable
	public UseConstructor(String newname) {
		//signature pattern/ parameter
		
		this.name = "kazi";
		//this is variable
		System.out.println("Name is " +this.name);
	}
	
	public UseConstructor(String newName, String address) {
		//Signature pattern/parameter: Multiple parameterize constructor
		
		this.name=newName; //assign value by calling local variable
		this.address=address;
		System.out.println("Name is " +this.name+" "+"Address is "+this.address);
		
	}

public static void main(String[] args) {
	
	//create a object of useConstructor class
	//class objectName= new constructorOfClass
	
	UseConstructor  obj = new UseConstructor();
	
	//int num1=34; //this is variable
	//int num2=num1; //this is value
	
	UseConstructor kaziobj = new UseConstructor("Kazi");
	
	UseConstructor ruponobj = new UseConstructor("rupon", "Queens,NY"); //Argument passing
	
	
}
}
