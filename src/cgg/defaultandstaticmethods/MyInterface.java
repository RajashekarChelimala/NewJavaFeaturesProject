package cgg.defaultandstaticmethods;

import java.util.Collections;
import java.util.List;

public interface MyInterface {

	default public List<Student> sortStudents(List<Student> stuList){
		
		Collections.sort(stuList);
		return stuList;
		
	}
	
	static void greet(String s) {
		System.out.println("Welcome : "+s);
	}
	
	
	public abstract int getMaxNum(List<Integer> intList);
	
//	default public int hashCode() {
//		
//	}
	
}
