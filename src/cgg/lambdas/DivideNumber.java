package cgg.lambdas;

public class DivideNumber {

	public static void main(String[] args) {

		SafeDivide sd =(p,q)->{
			if(q==0) {
				return 0;
			}
			else {
				return p/q;
			}
		};

		System.out.println("After SafeDivision the result is : "+sd.safeDivideNumber(10, 0));
		System.out.println("After SafeDivision the result is : "+sd.safeDivideNumber(10, 9));
		
	}

}
