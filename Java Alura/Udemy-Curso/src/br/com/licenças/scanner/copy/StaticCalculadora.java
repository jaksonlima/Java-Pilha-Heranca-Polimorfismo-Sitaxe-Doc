package br.com.licenças.scanner.copy;

public class StaticCalculadora {

	public static final double PI = 3.14159;

	public static double Circuferencia(double valor) {
		return 2.0 * PI * valor;
	}

	public static double volume(double valor) {
		return 4.0 * PI * valor * valor * valor / 3.0;
	}
}
