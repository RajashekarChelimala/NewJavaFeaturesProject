package streampipiline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPipeLine {

	public static void main(String[] args) {

		System.out.println("-------------STREAM PIPILINE--------------");
		System.out.println("-------skip()-------");
		Stream<String> onceModifiedStream = Stream.of("abc","def","ghi").skip(2);
		onceModifiedStream.forEach(System.out::println);
		
		System.out.println("------skip().map(substring())-------");
		Stream<String> stream = Stream.of("abc1","def2","ghi3","jkl","mno");
		Stream<String> twiceModifiedStream = stream.skip(1).map(e->e.substring(0, 3));
		twiceModifiedStream.forEach(System.out::println);
		
		System.out.println("------skip().map(substring()).sorted().count()-------");
		List<String> list = Arrays.asList("abc1","def2","ghi3","jkl","mno");
		long count = list.stream().skip(1).map(s->s.substring(0,3)).sorted().count();//Pipelining
		System.out.println(count);
	}

}
