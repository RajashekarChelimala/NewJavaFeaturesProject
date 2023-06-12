package defaultandstaticmethods;

import java.util.Collections;
import java.util.List;

public interface MyInterface {

	static void greet(String s) {
		System.out.println("Welcome : "+s);
	}
	
	default public List<Student> sortStudents(List<Student> stuList){
		
		Collections.sort(stuList);
		return stuList;
		
	}
	
	public abstract int getMaxNum(List<Integer> intList);
	
//	default public int hashCode() {
//		
//	}
	
}
