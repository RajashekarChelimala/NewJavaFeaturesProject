package cgg.zoneddatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {

		ZonedDateTime currTime = ZonedDateTime.now();
		ZonedDateTime zoneTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("Zone Time of India : "+currTime);
		System.out.println("Zone Time of Paris : "+zoneTime);
		
		ZonedDateTime americaTime = ZonedDateTime.of(2023, 5, 3, 11, 1, 33, 1234, ZoneId.of("America/Chicago"));
		System.out.println("America Time : "+americaTime);
	}

}