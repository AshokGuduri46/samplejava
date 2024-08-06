package looping_Statements;

public class Fibonacci_series {

	public static void main(String[] args) {
		
		
	int count =7, num1 = 0, num2=2;
	System.out.println("Fibacci series of " +count );

	for (int i=1; i<=count ; i++) {
		
		
		System.out.println(num1+ "");
		
		int sumofPrevTwo = num1+ num2;
		num1=num2;
		num2= sumofPrevTwo;
		
	}
	}

}
