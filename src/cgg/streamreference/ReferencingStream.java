package cgg.streamreference;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReferencingStream {

	public static void main(String[] args) {

//		Stream<String> stream = Stream.of("a","b","c","d").filter(e->e.contains("d"));
//		Optional<String> findAny = stream.findAny();
//		System.out.println(findAny.get());
//		
//		Optional<String> findFirst = stream.findFirst();
		
		//Here we can reuse the stream by converting it into the list
		
		List<String> collect = Stream.of("a","b","c","d").filter(e->e.contains("b")).collect(Collectors.toList());
		Optional<String> findAny = collect.stream().findAny();
		System.out.println(findAny.get());
		
		Optional<String> findFirst = collect.stream().findFirst();
		System.out.println(findFirst.get());
	}

}
