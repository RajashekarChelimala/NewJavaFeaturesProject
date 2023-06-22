package cgg.streamoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamExample {

	public static void main(String[] args) {

		List<Product> productList = Arrays.asList(new Product(25,"Apple"),
				  new Product(20,"Mango"),
				  new Product(15,"Orange"),
				  new Product(22,"Pineapple"),
				  new Product(30,"Watermelon"));
		System.out.println("---------------IS PARALLEL---------------");
		Stream<Product> parallelStream = productList.parallelStream();
		boolean parallel = parallelStream.isParallel();
		System.out.println(parallel);
		
		System.out.println("----------------ANY MATCH----------------");
		boolean anyMatch = parallelStream.map(product->product.getPrice()*12).anyMatch(price->price>200);
		System.out.println(anyMatch);
		
		System.out.println("-----------PARALLEL STREAM FROM INT STREAM, LONG STREAM, DOUBLE STREAM-------------");
		IntStream intStreamParallel = IntStream.range(1, 150).parallel();
		boolean parallel2 = intStreamParallel.isParallel();
		System.out.println(parallel2);
		
		System.out.println("-------------STREAM FROM PARALLEL TO SEQUENCIAL--------------");
		IntStream intStreamSequential = intStreamParallel.sequential();
		boolean parallel3 = intStreamSequential.isParallel();
		System.out.println(parallel3);
		
	}

}
