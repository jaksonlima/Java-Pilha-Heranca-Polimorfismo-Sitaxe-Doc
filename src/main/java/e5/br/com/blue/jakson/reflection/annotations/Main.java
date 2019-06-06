package e5.br.com.blue.jakson.reflection.annotations;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws Exception {

		MinhaClasse minhaClass = new MinhaClasse();
		executar(minhaClass);

	}

	@SuppressWarnings("rawtypes")
	private static void executar(MinhaClasse mc) throws Exception {

		Class c = mc.getClass();

		Method[] methods = c.getDeclaredMethods();

		for (Method m : methods) {
			Executar annot = m.getDeclaredAnnotation(Executar.class);

			if (annot != null) {
//				String arg = annot.arg();
				String arg = annot.value();
				m.invoke(mc, arg);

			}

		}
	}

}
