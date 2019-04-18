package br.com.licenças.scanner;

import java.util.Scanner;
import br.com.licenças.scanner.copy.Product;
import java.util.Locale;

public class TestScannerFor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		System.out.println("Entrada do data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Preco: ");
		product.price = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		product.quantity = sc.nextInt();
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Entre com um numero para ser adicionado ao estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Entre com um numero para ser removido do estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();

	}
}