package br.com.bytebank.banco.test.util;

import java.util.*;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);

		System.out.println(clienteCC4.getNome());
		System.out.println(cc4.getTitular());

		System.out.println("----------------");

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getTitular().getNome() + " = Sem Ordenação");
		}

		NumeroDaContaDeComparacao jakson = new NumeroDaContaDeComparacao();
		TitularDaContaComparator titularComparator = new TitularDaContaComparator();
		
		lista.sort(new TitularDaContaComparator());
		lista.sort(new NumeroDaContaDeComparacao());
		
		
		int retorno = jakson.compare(cc2, cc1);


		System.out.println("----------------");

		for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getTitular().getNome());
		}

//		System.out.println(lista);
//		System.out.println(retorno);

	}

}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c11, Conta c22) {
		
		String nomec1 = c11.getTitular().getNome();
		String nomec2 = c22.getTitular().getNome();
		 	
		return nomec1.compareTo(nomec2);
	}
	
}

class NumeroDaContaDeComparacao implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		
		return Integer.compare(c1.getNumero(), c2.getNumero());
		
//		return c1.getNumero() - c2.getNumero();

//		if (c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//		if (c1.getNumero() > c2.getNumero()) {
//
//		}
//		return +1;

	}

}









