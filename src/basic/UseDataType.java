package basic;

public class UseDataType {

	/*
	 * Data Type:Premitive boolean char
	 * 
	 * 
	 * byte int short long
	 * 
	 * double float
	 * 
	 * 
	 * Non-premitive String Arrays objects
	 * 
	 */
	

	byte age = 127;
	int number = 45;
	private int number1=46;
	short dailySale = 5987;
	long annualSale = 8545799;
	
	double salary = 5000.500;
	float coursefee = 4500.500f;
	
	boolean isInStock=true;
	char nameStartWith= 'S';
	
	//Non premitive Data type
	
	String fullname="Kazi Maoya 12347876899 899780";
	String samirfullName = "Samir";
	String arshilfullName = "Arshil";
	
	
	public static void main(String[] args) {

	   UseDataType use=new UseDataType();
	   
		
		
		// Con-cat-e-nate:concatenate +
		
		System.out.println("full Name is" + use.fullname);
	
		System.out.println("Arshil Full name is " + use.arshilfullName);
		
		
	}
}

	
	
	

