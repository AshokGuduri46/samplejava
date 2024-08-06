package hashMethods;
import java.util.HashMap;

public class HaasMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer > obj = new HashMap <String , Integer>();
		
		obj.put ("red", 1);
		obj.put ("green", 1);
		obj.put ("black", 6);
		
		obj.replace ("red", 1 , 46 );
		obj.remove ("black");
		
		System.out.println(obj);
		

	}

}
