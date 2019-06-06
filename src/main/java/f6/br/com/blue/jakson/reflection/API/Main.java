package f6.br.com.blue.jakson.reflection.API;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
	@SuppressWarnings({ "resource", "unchecked" })
	public static void main(String[] args) throws FileNotFoundException {

//		Cha cha = new Cha();
//		Cafe cafe = new Cafe();
//		cha.preparar();
//		cafe.preparar();

		String CaminhoArq = "class_nome.txt";
		try {
			Scanner CaminhoSC = new Scanner(new File(CaminhoArq));
			String classString = CaminhoSC.nextLine();
			Class<Bebida> bebidaClass = (Class<Bebida>) Class.forName(classString);
			Bebida prontoBebida = bebidaClass.getDeclaredConstructor().newInstance();
			prontoBebida.preparar();

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

	}

}
