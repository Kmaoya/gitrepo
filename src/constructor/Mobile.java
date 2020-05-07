package constructor;

public class Mobile {
	
	String mobileBrand;
	String mobileModel;
	double price;
	int ramsize;
	
	
	//right click-source-generated constructor using fields
	
		public Mobile() {
		
		}



	public Mobile(String mobileBrand) {
		
		this.mobileBrand = mobileBrand;
	}



	public Mobile(String mobileBrand, String mobileModel) {
		
		this.mobileBrand = mobileBrand;
		this.mobileModel = mobileModel;
	}



	public Mobile(String mobileBrand, String mobileModel, double price) {
		
		this.mobileBrand = mobileBrand;
		this.mobileModel = mobileModel;
		this.price = price;
	}



	public Mobile(String mobileBrand, String mobileModel, double price, int ramsize) {
		
		this.mobileBrand = mobileBrand;
		this.mobileModel = mobileModel;
		this.price = price;
		this.ramsize = ramsize;
	}
public static void main(String[] args ) {
	Mobile mobile = new Mobile();
	
}
}
