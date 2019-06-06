package n14.br.com.blue.jakson.lambda.closures;

public class Main {
	public static void main(String[] args) {
		Pessoas pessoa = new Pessoas(10);
		pessoa.setIdade(50);
		double total = pessoa.calcular();
		System.out.println(total);
	}

}
