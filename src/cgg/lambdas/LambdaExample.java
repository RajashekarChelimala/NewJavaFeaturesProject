package cgg.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExample {

	public static void main(String[] args) {
		
//		lambdaWithZeroParam();
//		System.out.println("------------------------------------");
//		anonymousClassWithZeroParam();
//		System.out.println("------------------------------------");
//		lambdaWithOneParam();
//		System.out.println("------------------------------------");
//		lambdaWithMultipleParam();
//		System.out.println("------------------------------------");
//		lambdaWithParamAndReturnType();
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee("Rajashekar","r@gmail.com",120000));
		empList.add(new Employee("Farooq","f@gmail.com",140000));
		empList.add(new Employee("Vamshi","v@gmail.com",150000));
		empList.add(new Employee("Ajay","a@gmail.com",110000));
		empList.add(new Employee("Sanjeeva","s@gmail.com",123000));
		empList.add(new Employee("Divya","d@gmail.com",141000));
		
		System.out.println("List Before sorting");
		empList.forEach(System.out::println);
		
//		Collections.sort(empList, new EmpComparator());
		Collections.sort(empList, new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println("\nList After sorting by Name\n");
		empList.forEach(System.out::println);
		
		Collections.sort(empList, new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return (int)(o1.getSalary() - o2.getSalary());
			}
		});
		
		System.out.println("\nList After sorting by Salary\n");
		empList.forEach(System.out::println);
		
		System.out.println("\n------------------ Using Lambda ---------------------\n");
		
		Collections.sort(empList, (e1,e2)->e1.getName().compareTo(e2.getName()));
		System.out.println("\nList After sorting by Name\n");
		empList.forEach(System.out::println);
		
		Collections.sort(empList, (e1,e2)->(int)(e1.getSalary() - e2.getSalary()));
		System.out.println("\nList After sorting by Salary\n");
		empList.forEach(System.out::println);
		
		
	}
		
	
	
	
	private static void lambdaWithParamAndReturnType() {
		MyInterface4 i4 = (a1,a2)->a1>a2;
		
		System.out.println(i4.test(11,2));
		
	}



	private static void lambdaWithMultipleParam() {
		MyInterface3 i3 = (name,score)->{
		
			System.out.println("Hello "+name);
			System.out.println("Your Score is "+score);
			
		};
		
		i3.method3("Price", 264);
	}



	private static void lambdaWithOneParam() {
		MyInterface2 i2 = name ->System.out.println("Welcome to Lambda with one parameter : "+name);
		
		i2.method2("Prince");
	}



	private static void anonymousClassWithZeroParam() {
		MyInterface1 i1 = new MyInterface1() {
			
			public void method1() {
				System.out.println("Anonymous class...");
			}
		};
		
		i1.method1();
	}
	

	private static void lambdaWithZeroParam() {
		
		//defining lambda or implementing interface
		MyInterface1 i1 = () -> System.out.println("Lambda with zero parameters...");
		
		//calling lambda
		i1.method1();
	}
	
	

}
