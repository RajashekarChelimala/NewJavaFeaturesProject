package cgg.lambdas;

public class AdditionUsingLambda {

	public static void main(String[] args) {
		
		AddingTwoNumbers s = (a,b)->{
			System.out.println("Sum of "+a+" and "+b+" is : "+(a+b));
		};

		s.add(10,20);
	}

}
