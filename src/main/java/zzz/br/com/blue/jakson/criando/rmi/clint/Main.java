package zzz.br.com.blue.jakson.criando.rmi.clint;

import java.rmi.Naming;

import zzz.br.com.blue.jakson.criando.rmi.ContaBancaria;

public class Main {

	public static void main(String[] args) throws Exception {
		ContaBancaria conta1 = (ContaBancaria) Naming.lookup("rmi://localhost:1099/conta1");
		ContaBancaria conta2 = (ContaBancaria) Naming.lookup("rmi://localhost:1099/conta2");
		
		conta1.depositar(1000);
		conta1.sacar(200);
		conta1.transferir(100, conta2);
		
		System.out.println(conta1.getSaldo());
		System.out.println(conta2.getSaldo());
	}
}
