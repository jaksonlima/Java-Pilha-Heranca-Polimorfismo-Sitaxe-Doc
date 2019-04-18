package br.com.licenças.scanner.copy;

import java.util.Locale;
import java.util.Scanner;

import br.com.licenças.scanner.TesteConstrutorPorduto;

public class Construtor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Preencha com o cadastro dos produtos: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		
		System.out.print("Preço: ");
		Double price = sc.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		int quantity = sc.nextInt();
		
		TesteConstrutorPorduto productt = new TesteConstrutorPorduto(name, price, quantity);
				
		
		System.out.println();
		System.out.println("Produtos: " + productt);
		System.out.println();
		System.out.print("Entre com um numero para ser adicionado no estoque: ");
		quantity = sc.nextInt();
		productt.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated nos produtos: " + productt);
		System.out.println();
		System.out.print("Entre com um numero para ser removido do estoque: ");
		quantity = sc.nextInt();
		productt.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated produtos: " + productt);
		sc.close();
	}
}
