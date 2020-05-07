package controlflow;

public class UseSwitchCase {
	
	public static void main(String[] args) {
		
		int foodSeries=2;
		String foodName;
		
		switch (foodSeries) {
		
		case 1:
			foodName="Pizza";
			break;
			
		case 2:
			foodName="Coffee";
			break;
			
		case 3:
			foodName="Tea";
			break;
			
		case 4:
			foodName="Cookie";
			break;	
			
		case 5:
			foodName="Pasta";
			break;
			
			
		case 6:
			foodName="Biriany";
			break;
			
			
			default:
				foodName="Invalid food Item";
				break;
		
		}
		System.out.println("Selected food: " + foodName);
	}

}
