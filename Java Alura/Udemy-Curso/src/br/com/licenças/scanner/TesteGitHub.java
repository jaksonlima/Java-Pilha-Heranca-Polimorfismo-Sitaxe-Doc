package br.com.licen�as.scanner;

import java.util.*;

public class TesteGitHub {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Qual sua idade: ");
		int n = sc.nextInt();
		int a = 17;

		if (a < n) {
			System.out.println("Autorizado a entrada: ");
		} else {
			System.out.println("Voce n�o pode entrar");
		}

		sc.close();

	}

}
