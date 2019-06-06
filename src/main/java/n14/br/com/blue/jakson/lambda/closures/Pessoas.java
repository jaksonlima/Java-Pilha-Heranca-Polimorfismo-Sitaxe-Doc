package n14.br.com.blue.jakson.lambda.closures;

public class Pessoas {

	private double idade;

	public Pessoas() {
	}

	public Pessoas(double idade) {
		super();
		this.idade = idade;
	}

	public double getIdade() {
		return idade;
	}

	public void setIdade(double idade) {
		this.idade = idade;
	}

	public double calcular() {
		double ajuste = 0.2;

		FactorCalculator calc = () -> idade * 10 / 2 * ajuste;

		return calc.calcular();
	}

}
