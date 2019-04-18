package br.com.licenças.scanner;

import java.util.Locale;
import java.util.Scanner;
import br.com.licenças.scanner.copy.StaticCalculadora;


public class TestStaticCalculadora {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		StaticCalculadora calculo = new StaticCalculadora();
		
		System.out.print("Enter radius: ");
		
		double radius = sc.nextDouble();
		double c = calculo.Circuferencia(radius);
		double v = calculo.volume(radius);
		
		System.out.printf("Circuferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calculo.PI);

	}

}
