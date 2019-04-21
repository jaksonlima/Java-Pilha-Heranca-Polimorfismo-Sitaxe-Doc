package o.br.com.blue.jakson.streams.exemplo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamParte01 {

	public static List<String> listString = Arrays.asList("computador", "papel", "caneta", "quadro", "borracha",
			"cortina", "gaveta");

	public static void main(String[] args) {

		// imprimi mesma coisa !!!!
//		listString.stream().sorted().limit(3).forEach(e -> System.out.println(e));
//		listString.stream().sorted().limit(3).forEach(System.out::println);

		StreamParte01.executar1();
		StreamParte01.executar2();
		StreamParte01.executar3();

	}

	public static void executar1() {
		// 1. Ordenar
		// 2. Manter só os 3 primeiros elementos
		// 3. Mostrar o resultado na tela

		listString.stream().limit(3).forEach(System.out::println);
	}

	public static void executar2() {
		// 1. Filtrar somente os elementos com letra 'C'
		// 2. Montar um nova Lista
		List<String> list = listString.stream().filter(e -> e.contains("c")).collect(Collectors.toList());

		System.out.println(list);

	}

	public static void executar3() {
		// 1. Somar a quantidade de caracteres dos elementos
		// 2. Retornar a soma

		int countList = listString.stream().collect(Collectors.summingInt(e -> e.length()));

		System.out.println(countList);
	}

}
