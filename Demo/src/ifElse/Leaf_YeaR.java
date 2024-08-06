package ifElse;

public class Leaf_YeaR {

	
	public static void main (String []args) {
	
	int year = 2004;
	
	if( (year%4==0)&&  (year%400==0)) {
		
		System.out.println("its a leaf year ");
		
	}
	
	else {
		System.out.println("its not a leaf year");
	}
	
	}
	}
