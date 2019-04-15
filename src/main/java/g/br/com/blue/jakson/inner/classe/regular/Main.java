package g.br.com.blue.jakson.inner.classe.regular;

public class Main {
	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		calculadora.setValor1(10);
		calculadora.setValor2(10);

		int result = calculadora.soma();
		System.out.println(result);
		
	}

}
