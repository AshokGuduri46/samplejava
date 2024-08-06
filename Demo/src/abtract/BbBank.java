package abtract;

public class BbBank implements Banking{
	public void savings() {
		System.out.println("Saving amount");
	}
	public void current () {
		System.out.println("Current Account");
	}
	
	public static void maiin (String []args) {
		
		BbBank obj = new BbBank ();
		
		obj.current();
		obj.savings();
	}

	}

