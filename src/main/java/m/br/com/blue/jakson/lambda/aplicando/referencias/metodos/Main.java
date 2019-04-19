package m.br.com.blue.jakson.lambda.aplicando.referencias.metodos;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<String> nome = Arrays.asList("jakson", "bruna", "ivete", "wilson");

//		nome.forEach(e -> System.out.println(e));

//		nome.replaceAll(e -> e.toUpperCase());

//		nome.replaceAll(String::toUpperCase);

//		nome.replaceAll(e -> Main.intercalate(e));

		nome.replaceAll(Main::intercalate);

		nome.forEach(System.out::println);

	}

	private static String intercalate(String s) {
		char[] chars = s.toCharArray();

		boolean lowerCase = true;
		StringBuilder sb = new StringBuilder();
		for (char c : chars) {
			if (lowerCase) {
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(Character.toUpperCase(c));
			}

			lowerCase = !lowerCase;
		}

		return sb.toString();
	}
}
