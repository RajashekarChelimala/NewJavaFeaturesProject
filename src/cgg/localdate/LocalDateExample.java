package cgg.localdate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateExample {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate tfd = LocalDate.of(2014, Month.JUNE, 2);//of is a static method
		System.out.println("Telangana Formation Day: "+tfd);
		
		System.out.println("Tomorrow is : "+today.plusDays(1));
		System.out.println("After weeks : "+today.plusWeeks(2));
		System.out.println("Months back : "+today.minusMonths(1));
		System.out.println("Leap or not : "+today.isLeapYear());
		System.out.println("Move to 30th day of the month : "+today.withDayOfMonth(30));
		System.out.println(today.withDayOfYear(340));
	}
}
