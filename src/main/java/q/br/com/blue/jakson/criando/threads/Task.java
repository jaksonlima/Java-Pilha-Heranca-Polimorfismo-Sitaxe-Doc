package q.br.com.blue.jakson.criando.threads;

public class Task implements Runnable {

	private Integer n;

	public Task(int n) {
		this.n = n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public Integer getN() {
		return n;
	}

	@Override
	public void run() {

		System.out.println("Tarefa " + this.n + " Iniciando");

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("Tarefa " + this.n + " Terminando");

	}

}
