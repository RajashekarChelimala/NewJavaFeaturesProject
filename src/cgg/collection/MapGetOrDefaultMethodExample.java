package cgg.collection;

import java.util.HashMap;

public class MapGetOrDefaultMethodExample {

	public static void main(String[] args) {

		HashMap<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1001, "Prince");
		hashMap.put(1002, "King");
		hashMap.put(1003, "Roman");
		
		String default1 = hashMap.getOrDefault(1004, "Rockey");
		System.out.println(default1);
		
		System.out.println("----------------");
		
		hashMap.forEach((k,v)->System.out.println(k+"\t"+v));
	}

}
