package defaultandstaticmethods;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		MyInterface myInterface =new MyClass();
		
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student("ABC",20));
		arrayList.add(new Student("DEF",30));
		arrayList.add(new Student("GHI",40));
		
		List<Student> students = myInterface.sortStudents(arrayList);
		for(Student student : students) {
			System.out.println(student.getName()+"\t"+student.getAge());
		}
		
		System.out.println("-----------------------------------------");
		
		MyInterface.greet("CGG");
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(300);
		intList.add(400);
		intList.add(500);

	}

}
