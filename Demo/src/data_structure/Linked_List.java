package data_structure;
import java.util.LinkedList;


public class Linked_List {

	public static void main(String[] args) {

	LinkedList<String> color = new LinkedList<String>();

	color.add("pink 0");
	color.add ("black 1");
	color.add ("yellow 2");
	color.add ("orane 3");
	color.add ("blue 4");
	
	color.set(3, "green");
	color.remove(1);
	
	System.out.println(color);
	System.out.println(color.get(2));
	
	}
	

}
