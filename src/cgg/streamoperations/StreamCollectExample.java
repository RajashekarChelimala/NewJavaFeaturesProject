package cgg.streamoperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollectExample {

	public static void main(String[] args) {

		System.out.println("---------------STREAM TO COLLECTION----------------");
		List<Product> productList = Arrays.asList(new Product(25,"Apple"),
					  new Product(20,"Mango"),
					  new Product(15,"Orange"),
					  new Product(22,"Pineapple"),
					  new Product(30,"Watermelon"));
		//method1(productList);
		
		System.out.println("-----------------SUMMARIZINGINT------------------");
		
		IntSummaryStatistics collect = productList.stream().collect(Collectors.summarizingInt(Product::getPrice));
		System.out.println(collect);
		
		System.out.println("-------------------GROUPINGBY-------------------");
		Map<Integer, List<Product>> collect2 = productList.stream().collect(Collectors.groupingBy(Product::getPrice));
		collect2.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
		
		System.out.println("---------------------PARTITIONINGBY---------------------");
		Map<Boolean, List<Product>> collect4 = productList.stream().collect(Collectors.partitioningBy(p->p.getPrice()>15));
		collect4.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
		
		System.out.println("---------------------PUSHING THE COLLECT TO PERFORM ADDITIONAL TRANSFORMATION-----------------------");
		Set<Product> collect3 = productList.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));
		collect3.forEach(System.out::println);
	}

	private static void method1(List<Product> productList) {
		//convert stream to collection
		List<String> collect = productList.stream().map(Product::getName).collect(Collectors.toList());
		collect.forEach(System.out::println);
		
		System.out.println("---------------REDUCE TO STRING - joining()-----------------");
		String collect2 = productList.stream().map(Product::getName).collect(Collectors.joining(",","[","]"));
		System.out.println(collect2);
		
		System.out.println("---------------AVERAGE PRICE - averagingInt()-------------------");
		Double collect3 = productList.stream().collect(Collectors.averagingInt(Product::getPrice));
		System.out.println(collect3);
		
	}

}