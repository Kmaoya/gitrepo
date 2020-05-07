package method;

public class UseMethod {

	//Method:block of code which runs which it is called.Method is used to perform
	//certain actions and they are known as function
	//Method type
	//return method without parameter
	//return method with parameter
	//non return method without parameter
	//non return method with parameter
	
	//method syntax:
	//AccessModifier returntype//methodtype methodName(){method body}
	
	//return types are:All data type,void,class and object
	
	//method syntax:
		//AccessModifier returntype//methodtype methodName(){method body}
	
	int a=25;
	int age=25;
	String mango="Apple";
	String mobileBrand="Apple";
	
	
	//non return type method// non paratarized non return type method
	public static void doSummation() {
		int number1=45;
		int number2=55;
		int summation=number1+number2;
		System.out.println("Summation value is "+summation);
		
	}
	
	
	
	public static void main(String[] args) {
		
		UseMethod obj=new UseMethod();
		//obj.dosummation()://call by object name
		
		obj.doSummation(); //call by class name
		doSummation();// without class name which is not industry practice
		
		
	}
	
	
}
