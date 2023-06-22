package cgg.lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Raja","Shekar",20),
					  new Person("Farooq","Md",22),
					  new Person("Vamshi","Botla",21),
					  new Person("Mahesh","Babu",42));
		System.out.println("Iterating using for loop");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		
		System.out.println("-----------------------------");
		System.out.println("Iterating using for in loop");

		for (Person person : people) {
			System.out.println(person);
		}
		
		
		//Internal Iterators
		System.out.println("-----------------------------");
		System.out.println("Iterating using lambda");
		people.forEach(p->System.out.println(p));
		
		System.out.println("-----------------------------");
		System.out.println("Iterating using method reference");
		people.forEach(System.out::println);
	}

}
