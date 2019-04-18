package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;

import br.com.bytebank.banco.modelo.Conta;

public class TesteWrapperIntergeer {

	public static void main(String[] args) {

//		int[] idades = new int[5];

//		int idade = 29;//Integer
//		Integer idadeRef =  new Integer(29);

//		String[] nomes = new String[5];

//		String nomes2 = "Jakson";

//		ArrayList jakson = new ArrayList();
//		jakson.add(nomes2);

//		ArrayList jakson2 = new ArrayList();
//		jakson2.add(idade);

//		System.out.println(jakson);
//		System.out.println(jakson2);

		System.out.println("-------------------------------------********-------------------------------------");

		int[] idades = new int[5];

//		String[] nomes = new String[5];

//		String[] nomes2 = new String[10];

//		int idade = 29;// Integer

		Integer idadeRef = new Integer(1);

		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idadeRef);

		System.out.println(numeros);

	}
}
