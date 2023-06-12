package cgg.periodduration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class PeriodExample {

	public static void main(String[] args) {
		
		LocalDate start = LocalDate.of(2014, Month.JUNE, 2);
		LocalDate end = LocalDate.now();
		
		Period period = start.until(end);
		System.out.println("Days : "+period.get(ChronoUnit.DAYS));
		System.out.println("Months : "+period.get(ChronoUnit.MONTHS));
		System.out.println("Years : "+period.get(ChronoUnit.YEARS));
		
		
		System.out.println("--------------------------------------------------");
		LocalDate initDate = LocalDate.now();
		LocalDate finalDate = initDate.plus(Period.ofDays(5));
		int days = Period.between(initDate, finalDate).getDays();
		System.out.println(days+" days");
		
		System.out.println("--------------------------------------------------");
		
		long between = ChronoUnit.DAYS.between(initDate, finalDate);
		System.out.println(between + " days ");
		
		System.out.println("--------------------------------------------------");
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(2001, Month.MARCH, 25);
		Period p = Period.between(birthday,today);
		long p1 = ChronoUnit.DAYS.between(birthday,today);
		
		System.out.println("You are "+ p.getYears()+" years "+p.getMonths()+" months, and "+p.getDays()+"days old.( "+p1+" days total)");
		
		//to calculate next Birthday
		
		LocalDate nextBday = birthday.withYear(today.getYear());
		//if birthday occured this year already, add 1 to the year
		if(nextBday.isBefore(today)||nextBday.isEqual(today)) {
			nextBday = nextBday.plusYears(1);
		}
		
		p = Period.between(today, nextBday);
		p1=ChronoUnit.DAYS.between(today, nextBday);
		System.out.println("There are "+p.getMonths()+" months, and "+p.getDays()+"days until your next birthday.("+p1+" days total)");
		
		System.out.println("-------------------------------------------------");
		
		LocalTime initialTime = LocalTime.of(6, 30, 0);
		LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
		
		Duration seconds = Duration.between(initialTime, finalTime);
		
		System.out.println(seconds+" seconds");
	
		long between2 = ChronoUnit.SECONDS.between(initialTime, finalTime);
		
		System.out.println(between2+" seconds");
		
		System.out.println("--------------------------------------------------");
		
		//Date and Time Formatting
		
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate.format(formatter));
		
		System.out.println("---------------------------------------------------");
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		LocalTime now = LocalTime.now();
		
		String format = now.format(timeFormatter);
		
		System.out.println(format);
		
		System.out.println("---------------------------------------------------");
		
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String text = "12/02/2015";
		LocalDate date = LocalDate.parse(text, formatter2);
		System.out.println(date);
	}

}