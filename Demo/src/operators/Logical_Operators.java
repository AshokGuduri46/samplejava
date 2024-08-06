package operators;

public class Logical_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =45;
		int b =34;
		
		System.out.println((a==b)&&(a>b));   //rendu conditons true ithene AND true avthundi
		System.out.println((a==b)||(a>b));
		
		System.out.println(!((a==b)&&(a>b)));    //AND NOT ichesariki AND ga maaruthundi
		System.out.println(!((a==b)||(a>b)));     // ikkada NOT ichesariki AND ga maruthundi 

	}

}
