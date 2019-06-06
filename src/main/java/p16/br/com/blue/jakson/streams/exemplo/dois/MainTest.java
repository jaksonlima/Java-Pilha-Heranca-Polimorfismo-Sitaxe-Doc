package p16.br.com.blue.jakson.streams.exemplo.dois;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {
	public static void main(String[] args) {

		List<Double> list1 = Arrays.asList(53.2, 98.0, 33.5, 47.8);

		List<Double> list2 = list1.stream().limit(2).sorted((x, y) -> -x.compareTo(y)).collect(Collectors.toList());

		System.out.println(list2);

	}

}
