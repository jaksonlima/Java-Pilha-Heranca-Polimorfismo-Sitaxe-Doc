package f6.br.com.blue.jakson.reflection.API;

import java.lang.reflect.Method;

public class Main2 {
	public static void main(String[] args) throws Exception {

		String s = "ola";

		Class<String> clazz = String.class;

		Method m = clazz.getMethod("charAt", int.class);

		char c = (Character) m.invoke(s, 1);

		System.out.println(c);

	}

}
