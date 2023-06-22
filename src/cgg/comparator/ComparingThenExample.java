package cgg.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparingThenExample {

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee("John", 30));
		empList.add(new Employee("Khan", 25));
		empList.add(new Employee("Vikranth", 27));
		empList.add(new Employee("Vishal", 23));
		empList.add(new Employee("Vikranth", 30));
		empList.add(new Employee("arjun", 28));
		empList.add(new Employee("Vikranth", 32));
		
		System.out.println("Before sorting...");
		empList.forEach(System.out::println);
		
		Comparator<Employee> thenComparing = Comparator.comparing(Employee::getName).thenComparing(Employee::getAge);
		Collections.sort(empList,thenComparing);
		
		System.out.println("After Sorting...");
		empList.forEach(System.out::println);
		
	}

}
