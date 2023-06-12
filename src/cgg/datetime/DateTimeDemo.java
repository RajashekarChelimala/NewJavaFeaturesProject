package cgg.datetime;

import java.time.LocalDateTime;

public class DateTimeDemo {

	public static void main(String[] args) {

		LocalDateTime todayNow = LocalDateTime.now();
		
		System.out.println("Now DateTime : "+todayNow);
		
		System.out.println("Minus Hours : "+todayNow.minusHours(13));
		
	}

}
