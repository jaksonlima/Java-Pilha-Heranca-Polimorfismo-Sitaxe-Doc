package g7.br.com.blue.jakson.inner.classe.regular;

public class MyOuter {

	public void msg() {
		final String msg = "Mensagem OK!";

		class MyInner {

			public void imprimirMensag() {
				System.out.println(msg);
			}
		}

		MyInner inner = new MyInner();

		inner.imprimirMensag();
	}

}
