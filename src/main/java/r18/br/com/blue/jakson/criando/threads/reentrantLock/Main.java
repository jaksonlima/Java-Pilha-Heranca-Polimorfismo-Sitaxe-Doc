package r18.br.com.blue.jakson.criando.threads.reentrantLock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {

		ExecutorService e = Executors.newFixedThreadPool(2);

		ContaBancaria contaB = new ContaBancaria();

		Cliente c1 = new Cliente(contaB);

		Cliente c2 = new Cliente(contaB);

		e.execute(c1);
		e.execute(c2);

		e.shutdown();

		while (!e.isTerminated()) {

			try {
				Thread.sleep(1000);
			} catch (Exception e2) {
			}
		}

		System.out.println("aqui --> " + contaB.getSaldo());

	}

}
