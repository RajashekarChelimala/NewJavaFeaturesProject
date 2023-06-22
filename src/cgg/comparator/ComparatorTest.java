package cgg.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorTest {

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee("John",30));
		empList.add(new Employee("Khan",25));
		empList.add(new Employee("Vikranth",27));
		empList.add(new Employee("Vishal",23));
		empList.add(new Employee("Arjun",28));
		
		System.out.println("Before Sorting...");
		
		for(Employee employee : empList) {
			System.out.println(employee);
		}
		
		Collections.sort(empList,(e1,e2)->e1.getName().compareTo(e2.getName()));
		
		System.out.println("After Sorting...");
		
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		
	}

}