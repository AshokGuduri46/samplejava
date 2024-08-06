package exception;
import java.util.Scanner;

public class TryCatchScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		try {
			System.out.println(n/2);
			
		}catch (Exception e ) {
			System.out.println("dont divide anything with 0");
		}

	}

}
 