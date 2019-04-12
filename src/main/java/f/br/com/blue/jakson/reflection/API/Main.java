package f.br.com.blue.jakson.reflection.API;

import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

//		Cha cha = new Cha();
//		Cafe cafe = new Cafe();
//		cha.preparar();
//		cafe.preparar();

		String className;

		Scanner scanner = new Scanner(new File("Class_name.txt"));
		className = scanner.nextLine();

		Class<Bebida> bebidaClass = (Class<Bebida>) Class.forName(className);
		Bebida bebida = bebidaClass.getDeclaredConstructor().newInstance();
		bebida.preparar();

	}

}
