
public class TestaLacos {
	public static void main(String[] args) {

		for (int multiplicador = 1; multiplicador <= 10; multiplicador = multiplicador + 1) {
			for (int contador = 0; contador <= 10; contador = contador + 1) {
				System.out.print(multiplicador * contador);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
