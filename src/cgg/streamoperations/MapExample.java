package cgg.streamoperations;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class MapExample {

	public static void main(String[] args) {

		System.out.println("--------------MAP--------------");
		ArrayList<String> uris = new ArrayList<String>();
		uris.add("C:\\MyFile1.txt");
		uris.add("D:\\MyFile2.txt");
		uris.add("C:\\MyFile3.txt");
		
		Stream<Path> map = uris.stream().map(uri->Paths.get(uri));
		map.forEach(System.out::println);
		
		System.out.println("------------FLAT MAP------------------");
		ArrayList<Details> details = new ArrayList<Details>();
		
		ArrayList<String> parts1 = new ArrayList<String>();
		parts1.add("Part1");
		parts1.add("Part2");
		parts1.add("Part3");
		
		ArrayList<String> parts2 = new ArrayList<String>();
		parts2.add("Parts1");
		parts2.add("Parts2");
		parts2.add("Parts3");
		parts2.add("Parts4");
		parts2.add("Parts5");
		
		Details details1 = new Details(1001,parts1);
		Details details2 = new Details(1002,parts2);
		
		details.add(details1);
		details.add(details2);
		
		Stream<String> flatMapStream = details.stream().flatMap(d->d.getParts().stream());
		flatMapStream.forEach(System.out::println);
		
	}
	
}