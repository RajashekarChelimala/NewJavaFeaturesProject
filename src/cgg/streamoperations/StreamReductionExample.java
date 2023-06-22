package cgg.streamoperations;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReductionExample {

	public static void main(String[] args) {

		System.out.println("-------------------REDUCE----------------------");
		OptionalInt reduce = IntStream.range(1, 4).reduce((a,b)->a+b);
		System.out.println(reduce.getAsInt());
		
		System.out.println("----------------REDUCE TWO PARAMS-------------------");
		int reduce2 = IntStream.range(1, 4).reduce(10,(a,b)->a+b);
		System.out.println(reduce2);
		
		System.out.println("----------------PARALLEL STREAM REDUCE------------------");
		Integer reduce3 = Arrays.asList(1,2,3).parallelStream().reduce(10, (a,b)->a+b,(a,b)->{
			System.out.println("Combiner called");
			return a+b;
		});
	}

}
