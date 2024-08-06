package functions;

public class First {
	
	public static int addnumber (int a , int b) {
		return (a+b);
		
	}

	public static int  subnumber (int a ,int b) {
		return (a-b);
	}
	public static void main(String[] args) {

		 int num = 90;
		 int num2 =90;
		   
		 int a = 60;
		 int b =60;
		 
		 int sum = addnumber(num,num2);
		 int sum2 = addnumber(a,b);
		 
		 System.out.println(num+num2);
		 System.out.println(a-b);
		 
	}

}
