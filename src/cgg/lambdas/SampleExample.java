package cgg.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SampleExample {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				  new Person("Raja","Shekar",20),
				  new Person("Farooq","Md",22),
				  new Person("Vamshi","Botla",21),
				  new Person("Mahesh","Babu",42),
				  new Person("Arjun","Allu",40),
				  new Person("Ram","Charan",40));
		
		//Step1: sort the list by lastname
		Collections.sort(people, (p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
		
		//Step2: create method that prints all the elements in the list
		System.out.println("Printing all persons");
//		printAll(people);
		printConditionally(people,p->true,p->System.out.println(p));
		
		//step3: create method that prints all persons with last name beginning with 'S'
		
		System.out.println("------------------------------------");
		System.out.println("Printing all persons with last name beginning with 'S'");
		printConditionally(people,p->p.getLastName().startsWith("S"),p->System.out.println(p));
		
		System.out.println("------------------------------------");
		System.out.println("Printing all persons with first name beginning with 'R'");
		printConditionally(people,p->p.getFirstName().startsWith("R"),p->System.out.println(p));
	}
	
	private static void printAll(List<Person> persons) {
		for (Person person : persons) {
			System.out.println(persons);
		}
	}
	
	private static void printConditionally(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : persons) {
			if(predicate.test(person)) {
				consumer.accept(person);
			}
		}
		
		
	}

}