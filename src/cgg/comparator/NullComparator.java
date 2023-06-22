package cgg.comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class NullComparator {

	public static void main(String[] args) {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee("John", 30));
		empList.add(new Employee("Khan", 25));
		empList.add(new Employee("Vikranth", 27));
		empList.add(new Employee("Vishal", 23));
		empList.add(new Employee(null, 30));
		empList.add(new Employee("Arjun", 28));
		empList.add(new Employee(null, 32));
		empList.add(new Employee("Bhavani", 28));
		
		System.out.println("Before sorting...");
		empList.forEach(System.out::println);
		
//		Comparator<Employee> comp = Comparator.comparing(Employee::getName,Comparator.nullsFirst(String::compareTo));
		Comparator<Employee> comp1 = Comparator.comparing(Employee::getName,Comparator.nullsLast(String::compareTo));
		
		System.out.println("After sorting...");
		empList.sort(comp1);
		empList.forEach(System.out::println);
		
	}

}
