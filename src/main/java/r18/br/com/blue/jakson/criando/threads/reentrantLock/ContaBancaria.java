package r18.br.com.blue.jakson.criando.threads.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class ContaBancaria {

	private ReentrantLock lock = new ReentrantLock();

	private double valor;

	public void sacar(double saldo) {
		lock.lock();
		try {
			this.valor -= saldo;
		} finally {
			lock.unlock();
		}
	}

	public void depositar(double saldo) {
		lock.lock();
		try {
			this.valor += saldo;
		} finally {
			lock.unlock();
		}

	}

	public double getSaldo() {
		return this.valor;
	}

}
