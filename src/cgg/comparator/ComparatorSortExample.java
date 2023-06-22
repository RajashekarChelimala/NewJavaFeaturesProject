package cgg.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorSortExample {

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee("John", 30));
		empList.add(new Employee("Khan", 25));
		empList.add(new Employee("Vikranth", 27));
		empList.add(new Employee("Vishal", 23));
		empList.add(new Employee("Arjun", 28));
		empList.add(new Employee("Bhavani", 28));

		System.out.println("Before sorting...");
		empList.forEach(System.out::println);
		
		empList.sort(Comparator.comparing(Employee::getName));
		
		System.out.println("After Sorting...");
		empList.forEach(System.out::println);
		
		
		System.out.println("-------------REVERSE------------");
		Comparator<Employee> comp = Comparator.comparing(Employee::getName);
		empList.sort(comp.reversed());
		empList.forEach(System.out::println);
		
	}

}
