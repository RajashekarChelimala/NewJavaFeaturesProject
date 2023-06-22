package cgg.functionalinterface;

import java.util.HashMap;
import java.util.function.BiConsumer;

import cgg.streamapi.Student;

public class BiConsumerExample {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer,String>();
		
		hashMap.put(1, "A");
		hashMap.put(2, "B");
		hashMap.put(3, "C");
		hashMap.put(4, "D");
		hashMap.put(5, "E");
		
//		BiConsumer<Integer,String> biConsumer = (k,v)->System.out.println("Key : "+k+"\t Value : "+v);
//		
//		hashMap.forEach(biConsumer);
		hashMap.forEach((k,v)->System.out.println("Key : "+k+"\t Value : "+v));

		HashMap<Integer, Student> stuMap = new HashMap<Integer,Student>();
		stuMap.put(1001, new Student("ABC",20));
		stuMap.put(1002, new Student("DEF",21));
		stuMap.forEach((k,v)->System.out.println("Key : "+k+"\t Value : "+v));
	}

}
