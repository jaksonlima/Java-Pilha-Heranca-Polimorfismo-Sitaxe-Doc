package d.br.com.blue.jakson.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {

		Class<Televisao> tvClass = Televisao.class;

		Field[] fields = tvClass.getDeclaredFields();

		for (Field field : fields) {
			System.out.println(field.getName() + " => " + field.getType());
		}
		
		System.out.println("-----------------------");

		Method[] methods = tvClass.getDeclaredMethods();

		for (Method method : methods) {
			System.out.println(method.getName() + " => " + method.getReturnType() + " => "
					+ Arrays.toString(method.getParameters()));
		}

		System.out.println("-----------------------");

		Televisao tv1 = new Televisao();

		Method mudarCanal = tvClass.getDeclaredMethod("mudarCanal", int.class);

		mudarCanal.invoke(tv1, 25);
		
		System.out.println("-----------------------");
		
		Method mudarCanal2 = tvClass.getDeclaredMethod("ligar");
		
		mudarCanal2.invoke(tv1);

	}

}
