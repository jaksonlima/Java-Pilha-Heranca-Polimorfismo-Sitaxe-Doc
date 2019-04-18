
public class Conta {
	private double saldo;
	private int agencia;
	int numero;
	private Cliente titular;
	private static int total;/* TOTAL DE CONTAS DA MINHA CLASS CONTA */

	public Conta(int agencia, int numero) {
		Conta.total = Conta.total + 1;/* TOTAL DE CONTAS DA MINHA CLASS CONTA */
		System.out.println("Totais de contas abertas: " + Conta.total);/* TOTAL DE CONTAS DA MINHA CLASS CONTA */

		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Uma nova conta");
	}
	public static int getTotal() {/* TOTAL DE CONTAS DA MINHA CLASS CONTA */
		return Conta.total;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean tranfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public void setSaldo(double valor) {
		this.saldo = valor;

	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setAgencia(int valor) {
		if (valor <= 0) {
			System.out.println("Erro valor nao pode ser menor que 0");
			return;
		}
		this.agencia = valor;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setTiular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

}
