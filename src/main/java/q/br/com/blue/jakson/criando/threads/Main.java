package q.br.com.blue.jakson.criando.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {

		ExecutorService e0 = Executors.newSingleThreadExecutor();
		ExecutorService e = Executors.newFixedThreadPool(5);

		for (int i = 0; i <= 5; i++) {

			Task t = new Task(i);
			Task t0 = new Task(i);

			e.execute(t);
			e.execute(t0);
		}

		e.shutdown();

	}

}
