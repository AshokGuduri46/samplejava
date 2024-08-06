package date_time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;


public class Date_Time {
	
	
	public static void main(String[] args) {
		
		LocalDate obj = LocalDate.now();
		System.out.println(obj);
		
		LocalTime obj1 = LocalTime.now();
		System.out.println(obj1);
		
		LocalDateTime obj2 = LocalDateTime.now();
		System.out.println(obj2);
		
	}
}

