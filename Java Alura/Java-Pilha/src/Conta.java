
public class Conta {

	private double valor;
	private int saldo;
	String nome;

	public boolean setValor(int valor) {
		this.valor = valor;
		return true;
	}

	public void getValor() {
		this.valor = this.valor;
	}

	public void saca(Double valor) {

		if (this.saldo < valor) {

			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);

		}

		this.saldo -= valor;
	}
}
