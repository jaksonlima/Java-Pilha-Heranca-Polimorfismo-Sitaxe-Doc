package br.com.licenças.scanner;

import java.util.Scanner;

public class TestsMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[1].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.print("Diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[1].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}

		}
		System.out.println("Numeros negativos: " + count);

		sc.close();
	}

}
