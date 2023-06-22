package cgg.streamoperations;

import java.util.ArrayList;
import java.util.stream.Stream;

import cgg.streamapi.Student;

public class StreamOperations {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("AAAB");
		list.add("BBBC");
		list.add("CCCD");
		list.add("DDDE");
		list.add("CCCD");
		
//		Stream<String> stream = list.stream();
//		Stream<String> distinct = stream.distinct();
//		long count = distinct.count();
		
		System.out.println("-------------------COUNT-----------------------");
		
		long count = list.stream().distinct().count();
		
		System.out.println("Count : "+count);
		
		System.out.println("------------------ANY MATCH--------------------");
		//streams cannot be reused once the terminal operation is called.
		
		boolean anyMatch = list.stream().anyMatch(e->e.contains("DE"));
		System.out.println(anyMatch);
		
		System.out.println("--------------------FILTER-------------------------");
		
		ArrayList<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("PK",23));
		stuList.add(new Student("KK",26));
		stuList.add(new Student("MK",23));
		stuList.add(new Student("RK",22));
		
		Stream<Student> filter = stuList.stream().filter(t -> t.getAge()>22 );
		filter.forEach(System.out::println);
		
		System.out.println("-------------------ALL MATCH----------------------");
		
		boolean allMatch = stuList.stream().allMatch(s->s.getName().contains("K"));
		System.out.println(allMatch);
		
		System.out.println("-------------------ANY MATCH-----------------------");
		boolean anyMatch2 = stuList.stream().anyMatch(s->s.getAge()>22);
		System.out.println(anyMatch2);
		
		System.out.println("-------------------NONE MATCH----------------------");
		boolean noneMatch = stuList.stream().noneMatch(s->s.getAge()>55);
		System.out.println(noneMatch);
	}

}
