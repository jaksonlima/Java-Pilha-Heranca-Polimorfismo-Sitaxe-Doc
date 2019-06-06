package j10.br.com.blue.jakson.method.statiic.inner.classes;

public class ClasseDeFora {

	static int valor2 = 10;
	static String string = "valor tem que esta '20' ----> " + ", ";

	public static class ClasseDeDentro {

		int valor = 10;

		public void setValor(Integer valor) {
			this.valor = valor;
		}

		public int getValor() {
			return valor;
		}

		public void imprimir() {
			int valorTotal = valor + valor2;
			System.out.println(string + valorTotal);
		}

	}

}
