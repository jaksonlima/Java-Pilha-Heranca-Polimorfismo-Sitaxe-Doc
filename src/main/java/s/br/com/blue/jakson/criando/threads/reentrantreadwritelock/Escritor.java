package s.br.com.blue.jakson.criando.threads.reentrantreadwritelock;

public class Escritor implements Runnable {

	private Info info;

	public Escritor(Info info) {
		this.info = info;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			info.setInfo();
		}
	}
}
