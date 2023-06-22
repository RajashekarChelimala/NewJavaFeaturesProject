package cgg.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorComparingExample {

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee("John",30));
		empList.add(new Employee("Khan",25));
		empList.add(new Employee("Vikranth",27));
		empList.add(new Employee("Vishal",23));
		empList.add(new Employee("arjun",28));
		
		System.out.println("Before sorting...");
		empList.forEach(System.out::println);
		
//		Comparator<Employee> comparing = Comparator.comparing(Employee::getName);
		Comparator<Employee> comparing1 = Comparator.comparing(Employee::getName,String.CASE_INSENSITIVE_ORDER);
		Collections.sort(empList,comparing1);
		
		System.out.println("After sorting...");
		empList.forEach(System.out::println);
	}

}
