package polymosrphism;


//method over loading//

public class first {
	
	public void studentDetails(String Name) {
		System.out.println(Name);
	}
	
	public void studentDetails(	int age) {
		System.out.println(age);
	}
	
	public void studentDetails(long phone ) {
		System.out.println(phone);
	}
	
	public void studentDetails(boolean isactive) {
		System.out.println(isactive);
	}

	public static void main(String[] args) {
		
		first obj = new first();
		
		obj.studentDetails("ashok");
		obj.studentDetails(24);
		obj.studentDetails(65656565656l);
		obj.studentDetails(false);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
