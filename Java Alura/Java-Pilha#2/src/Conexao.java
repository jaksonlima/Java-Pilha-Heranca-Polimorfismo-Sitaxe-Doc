
public class Conexao implements AutoCloseable {

	public Conexao() {
		System.out.println("");
		System.out.println("Abrindo uma conexao");
//		throw new IllegalStateException();
	}

	public void leDados() {
		System.out.println("Recebimento de dados");
		throw new IllegalStateException();
	}

	@Override
	public void close() {
		System.out.println("Fecha conexao");

	}

//	public void fecha() {
//		System.out.println("Fecha conexao");
//	}

}
