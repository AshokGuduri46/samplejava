package data_structure;

import java.util.ArrayList; 

public class Array_List {
	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add ("volvo 1");
		cars.add("bmw 2");
		cars.add("mg hector 3");
		cars.add ("ford 4");
		
		cars.add("telsa 5");
		
		cars.addFirst("ferari 0");
		cars.addLast("mazda6");
		
for (int i=0; i<cars.size(); i++) {
	
	
	System.out.println(cars.get(i));
}
		
		
		
	}

}
