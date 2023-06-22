package cgg.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCreationExample {

	public static void main(String[] args) {
		
		String[] arr = {"ABC" , "PQR", "LMN", "XYZ"};
		
		Stream<String> stream = Arrays.stream(arr);
		
		stream.forEach(System.out::println);
		
		System.out.println("---------------------------------------");
		
		Stream<String> stream2 = Stream.of("1","2","3","4");
		
//		System.out.println(stream2);
		stream2.forEach(System.out::println);
		
		System.out.println("---------------------------------------");
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		
		Stream<String> stream3 = list.stream();
		
		stream3.forEach(System.out::println);
		
		
		ArrayList<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("PK",26));
		stuList.add(new Student("KK",22));
		stuList.add(new Student("RK",21));
		stuList.add(new Student("MK",25));
		stuList.add(new Student("JK",23));
		stuList.add(new Student("VK",24));
		
		Stream<Student> parallelStream = stuList.parallelStream();
//		Stream<Student> stream4 = stuList.stream();
		System.out.println("Processing the student data...");
		parallelStream.forEach(s->doProcess(s));
//		stream4.forEach(s->doProcess(s));
		
		//Using parallelStream gives different output than using stream(order of iteration is not maintained)
		//processing the massive amount of data : go for parallelStream
	}

	private static void doProcess(Student s) {
		System.out.println(s);
	}

}
