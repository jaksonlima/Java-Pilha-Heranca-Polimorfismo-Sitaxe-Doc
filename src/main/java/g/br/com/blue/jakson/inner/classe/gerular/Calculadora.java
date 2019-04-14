package g.br.com.blue.jakson.inner.classe.gerular;

public class Calculadora {

	private Integer valor1;
	private Integer valor2;
	private Integer resuldado;

	private class Soma {
		public void executarSoma() {
			resuldado = valor1 + valor2;
		}
	}

	public Calculadora() {
	}

	public Integer getValor1() {
		return valor1;
	}

	public void setValor1(Integer valor1) {
		this.valor1 = valor1;
	}

	public Integer getValor2() {
		return valor2;
	}

	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}

	public int soma() {
		Calculadora.Soma somaTotal = new Calculadora.Soma();
		somaTotal.executarSoma();
		return resuldado;
	}

}
