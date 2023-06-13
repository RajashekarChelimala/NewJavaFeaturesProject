package cgg.lambdas;

public class LambdaInterfaceAsArgument {

	public static void main(String[] args) {
		
//		Foo f =()->System.out.println("Hello World");
//		doPerform(f);
		doPerform(()->System.out.println("Hello World"));

	}

	private static void doPerform(Foo f) {
		f.perform();
		
	}

}
