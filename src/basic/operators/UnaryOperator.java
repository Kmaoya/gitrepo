package basic.operators;

public class UnaryOperator {
	
	
// Increment operator: ++ always add 1
	// PreIncrement: ++number
	// PostIncrement: number++
	
	// Decrement Operator:
	
	
	
	
	
	public static void main(String[] args) {
		
		// ++ Increment Unary operator
		// preIncrement: ++ number: 1+ present value
		// PostIncrement: number++ : Its add a value(+1)for future
		
		
		// -- Decrement Unary operator
		
		// PreDecrement: --number: -1 present value
		// PostDecrement: number--: It Deduct a value(-1)for future
		
		int number = 6;
		System.out.println(number++);
		System.out.println(number);// 1+number // 7
		number++;
		number++;
		System.out.println(number);// 9
		--number;
		System.out.println(number);
		++number;
		System.out.println(number);
		number--;
		number--;
		number++;
		number++;
		--number;
		++number;
		System.out.println(number);//
}

}
