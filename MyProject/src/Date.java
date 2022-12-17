import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomorrow = date.plusDays(1);

		System.out.println("Today: " + date);
		System.out.println("Yesterday: " + yesterday);
		System.out.println("Tomorrow: " + tomorrow);

		LocalTime time = LocalTime.now();
		System.out.println("Time: " + time);

		LocalDateTime o2 = LocalDateTime.now();
		System.out.println(o2);

		LocalDateTime o3 = LocalDateTime.now();
		System.out.println("Before formatting: " + o3);
		DateTimeFormatter o4 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formattedDate = o3.format(o4);
		System.out.println("After formatting: " + formattedDate);

	}

}
