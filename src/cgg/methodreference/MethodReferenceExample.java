package cgg.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
//		
//		Runnable r =()->System.out.println("My Task is Running...");
//		
//		Runnable r = MethodReferenceExample::myRun;
//
//		executorService.execute(r);
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		numbers.forEach(System.out::println);
		
		System.out.println("-----------------------------------");
		
		List<Double> findSquareRoots = MethodReferenceExample.findSquareRoots(numbers,Double::new);
		findSquareRoots.forEach(System.out::println);
		
		
		
		ArrayList<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person("ABC",20));
		persons.add(new Person("DEF",21));
		persons.add(new Person("GHI",19));
		persons.add(new Person("JKL",20));
		persons.add(new Person("MNO",22));
		persons.add(new Person("PQR",23));
		
		System.out.println("-----------------------------------------");
		
		List<String> personNames = MethodReferenceExample.getPersonName(persons,Person::getName);
		personNames.forEach(System.out::println);
		
		System.out.println("-----------------------------------------");
		
		PersonInformation pi = Person::new;
		
		System.out.println(pi.getPerson().getInfo());
		
	}
	
	private static List<String> getPersonName(ArrayList<Person> persons, Function<Person,String> f) {
		
		ArrayList<String> result = new ArrayList<String>();
		persons.forEach(p->result.add(f.apply(p)));
		return result;
	}

	private static List<Double> findSquareRoots(List<Integer> numbers, Function<Integer,Double> f) {
		
		List<Double> result = new ArrayList<Double>();
		numbers.forEach(x->result.add(Math.sqrt(f.apply(x))));
		return result;
	}



	private static void myRun() {
		System.out.println("My Task is Running...");
	}

}
