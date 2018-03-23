package myprojects;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example10 {

	public static void main(String[] args) {
		List<String> vehicles=Arrays.asList("bus","car","bike");
//		Stream<String> vStream=vehicles.stream();
//		vStream.forEach(System.out::println);
		
		vehicles.stream().forEach(System.out::println);
	}

}
