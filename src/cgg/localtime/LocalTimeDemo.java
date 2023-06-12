package cgg.localtime;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();
		
		System.out.println("Current Time : "+time);

		LocalTime of = LocalTime.of(5, 33, 33, 123452);
		System.out.println("LocalTime.Of : "+ of);
		
		System.out.println("Add Hours : "+time.plusHours(1));
		
		System.out.println("Add Minutes : "+time.getMinute());
		
		System.out.println(time+ " isAfter "+of+" : "+time.isAfter(of));
		
	}

}
