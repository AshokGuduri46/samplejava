package abtract;



public class Uninon extends Bank{  
	
	public void salary () {
		System.out.println("salarty accnt");
		
		
	}
	
	public void savings (){
		System.out.println("savings account");
		
	}
	
	public void ashok (){
		System.out.println("saccount");
		
	}
	
	public static void main (String []args ) {
		
		Uninon obj = new Uninon ();
		
		
		obj.salary();
	   obj.savings();
		
        obj.current();
        
        obj.ashok();
	}
}
