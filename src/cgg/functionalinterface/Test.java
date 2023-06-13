package cgg.functionalinterface;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		//createThreadUsingAnonymousClass();
		createThreadUsingLambda();
		createCustomLambda();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hyd");
		list.add("Kolkata");
		list.add("Bangalore");
		list.add("Thiruvananthapuram");
		//list.forEach(n->System.out.println(n));
		
		//Method reference
		//:: is scope resolution
		list.forEach(System.out::println);
	}
	
	private static void createCustomLambda() {
		
		//defining lambda
		MyInterface i =name-> System.out.println("Welcome to testing lambda : "+name);
		
		//invoking lambda
		i.meth1("prince");
	}
	
	private static void createThreadUsingLambda() {
		
		//lambda expression
		Runnable r =()->System.out.println("My Runnable...");
		Thread thread = new Thread(r);
		thread.start();
	}

	private static void createThreadUsingAnonymousClass() {
		//anonymous class
		Runnable r = new Runnable(){
			@Override
			public void run() {
				System.out.println("Iam thread my task is executing...");
			}
		};

		Thread thread = new Thread(r);
		thread.start();
	}

}
