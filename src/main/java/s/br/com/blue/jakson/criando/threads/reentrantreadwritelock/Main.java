package s.br.com.blue.jakson.criando.threads.reentrantreadwritelock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) throws Exception {

		Info info = new Info();
		int numLeitores = 3;
		int numEscritores = 3;

		ExecutorService e = Executors.newFixedThreadPool(numLeitores + numEscritores);

		for (int i = 0; i < numEscritores; i++) {
			Escritor w = new Escritor(info);
			e.execute(w);
		}

		for (int i = 0; i < numLeitores; i++) {
			Leitor r = new Leitor("Leitor " + i, info);
			e.execute(r);
		}

		e.shutdown();
	}
}
