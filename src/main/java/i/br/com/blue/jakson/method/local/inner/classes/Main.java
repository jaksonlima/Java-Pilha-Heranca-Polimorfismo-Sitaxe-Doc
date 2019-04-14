package i.br.com.blue.jakson.method.local.inner.classes;

public class Main {
	public static void main(String[] args) {

		Bebida cha = new Cha();

		Bebida bebida = new Bebida() {

			@Override
			public void preparar() {
				System.out.println("Preparando bebida não reconhecida");
			}
		};

		cha.preparar();
		bebida.preparar();

	}
}
