package r18.br.com.blue.jakson.criando.threads.reentrantLock;

public class Cliente implements Runnable {

	private ContaBancaria contaB;

	public Cliente(ContaBancaria contaB) {
		this.contaB = contaB;
	}

	@Override
	public void run() {

		try {
			for (int i = 0; i < 5; i++) {
				contaB.depositar(100.0);
				Thread.sleep(1000);
				contaB.sacar(100.0);
			}
		} catch (InterruptedException e) {
		}

	}

}
