package j10.br.com.blue.jakson.method.statiic.inner.classes;

public class Main {
	public static void main(String[] args) {

		ClasseDeFora.ClasseDeDentro innerClassStatic = new ClasseDeFora.ClasseDeDentro();

		innerClassStatic.setValor(30);
		System.out.println(innerClassStatic.getValor());
		innerClassStatic.imprimir();
	}

}
