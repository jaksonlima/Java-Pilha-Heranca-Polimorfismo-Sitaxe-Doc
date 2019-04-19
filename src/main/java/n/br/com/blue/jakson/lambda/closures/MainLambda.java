package n.br.com.blue.jakson.lambda.closures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MainLambda {
	public static void main(String[] args) {

		Consumer<String> processor = msg -> {

			System.out.println(msg);

		};

		processor.accept("Java");
		
		System.out.println("---------------------------");
		
//		Function<Double, Double> func = x -> x / 2;
		
//		Function<Double, Double> func = x -> { return x / 2; };
		
		Function<Double, Double> func = (x) -> (x / 2);
		
		System.out.println(func.apply(10.8));
		
		System.out.println("-----------------");
		
		List<Integer> list = Arrays.asList(3, 2, 4, 5, 1);
		
		list.sort((a, b) -> a.compareTo(b));
		
		list.forEach(System.out::println);



	}

}
