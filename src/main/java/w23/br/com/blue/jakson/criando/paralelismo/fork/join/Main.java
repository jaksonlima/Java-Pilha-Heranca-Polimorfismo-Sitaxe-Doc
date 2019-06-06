package w23.br.com.blue.jakson.criando.paralelismo.fork.join;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class Main {

	public static void main(String[] args) {

		int[] array = new int[1000000];
		Arrays.fill(array, 1);

		SumArray task = new SumArray(array, 0, array.length - 1);

		ForkJoinPool fj = new ForkJoinPool();
		int soma = fj.invoke(task);

		System.out.println(soma);
	}
}
