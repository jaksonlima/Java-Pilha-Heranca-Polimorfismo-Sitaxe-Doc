package l12.br.com.blue.jakson.lambda.list.collections.API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Integer> lis1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		List<Integer> lis2 = new ArrayList<Integer>();

		lis2.add(1);
		lis2.add(2);
		lis2.add(3);
		lis2.add(4);
		lis2.add(5);
		lis2.add(6);
		lis2.add(7);
		lis2.add(8);
		lis2.add(9);

		lis1.sort((x, y) -> x.compareTo(y));

		lis1.replaceAll(e -> e * 2);

		lis2.removeIf(e -> e % 2 != 0);

		lis2.forEach(e -> System.out.println(e));

	}
}
