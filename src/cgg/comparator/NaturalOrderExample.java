package cgg.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NaturalOrderExample {

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee("John", 30));
		empList.add(new Employee("Khan", 25));
		empList.add(new Employee("Vikranth", 27));
		empList.add(new Employee("Vishal", 23));
		empList.add(new Employee("Arjun", 28));
		empList.add(new Employee("Bhavani", 28));
		
		List<String> nameList = empList.stream().map(Employee::getName).collect(Collectors.toList());
		
		System.out.println("Before sorting...");
		nameList.forEach(System.out::println);
			
//		nameList.sort(Comparator.naturalOrder());
		nameList.sort(Comparator.reverseOrder());
		
		System.out.println("-------------------------------------------");
		nameList.forEach(System.out::println);
		
	}

}
