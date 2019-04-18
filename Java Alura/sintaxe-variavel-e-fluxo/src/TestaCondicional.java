
public class TestaCondicional {

	public static void main(String[] args) {

		int idade = 17;

		int quantidadePessoas = 2;

		double quantidadeCriancas = 1;


		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo a proveite o parque");
		} else {
			if (quantidadePessoas >= 3) {
				System.out.println("Você não tem 18, mas " + "pode entrar, pois está acompanhado");
			} else {
				if (quantidadeCriancas >= 1) {
					System.out.println("Efetuado o nome de cadastro em nosso portal referente ao jakson");
				} else {
					System.out.println("infelizmente você não pode entrar");
				}
			}

		}

	}

}