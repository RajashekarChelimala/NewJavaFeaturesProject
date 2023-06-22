package cgg.infinitestreams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class InfiniteStreamExample {

	public static void main(String[] args) {

		System.out.println("------------------INFINITE STREAM---------------------");
		Stream<Integer> iterate = Stream.iterate(0,i->i+2);
		
		List<Integer> collect = iterate.limit(10).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
	
		System.out.println("------------------EMPTY STREAM-------------------------");
		Stream<String> empty = Stream.<String>empty();
		empty.forEach(System.out::println);
		
		System.out.println("--------------------STREAM OF COLLECTIONS------------------------");
		
		List<String> asList = Arrays.asList("a","b","c","d");
		Stream<String> stream = asList.stream();
		stream.forEach(System.out::println);
		
		System.out.println("--------------------ARRAY STREAM-------------------------");
		String [] arr = {"a","b","c","d"};
//		Stream<String> stream2 = Arrays.stream(arr);
		Stream<String> stream3 = Arrays.stream(arr, 1, 3);
		stream3.forEach(System.out::println);
		
		System.out.println("------------------STREAM BUILDER-------------------------");
		Stream<String> build = Stream.<String>builder().add("AA").add("BB").add("CC").build();
		build.forEach(System.out::println);
		
		System.out.println("----------------------GENERATE------------------------");
		Stream<String> limit = Stream.generate(()->"Hello").limit(10);
		limit.forEach(System.out::println);
		
		System.out.println("---------------------INT STREAM-----------------------");
		System.out.println("-----range()----");
		IntStream range = IntStream.range(1, 6);
		range.forEach(System.out::println);
		System.out.println("-----rangeClosed()----");
		IntStream rangeClosed = IntStream.rangeClosed(1, 6);
		rangeClosed.forEach(System.out::println);
		
		System.out.println("--------------------LONG STREAM-----------------------");
		LongStream range2 = LongStream.range(1, 6);
		range2.forEach(System.out::println);
		//LongStream is also having rangeClosed() method
		
		System.out.println("-------------------DOUBLE STREAM - RANDOM-------------------------");
		Random random = new Random();
		DoubleStream doubles = random.doubles(5);
		doubles.forEach(System.out::println);
		
		System.out.println("---------------------CHARS--------------------------");
		IntStream chars = "abcd".chars();
		chars.forEach(System.out::println);
		
		System.out.println("--------------------");
	}

}