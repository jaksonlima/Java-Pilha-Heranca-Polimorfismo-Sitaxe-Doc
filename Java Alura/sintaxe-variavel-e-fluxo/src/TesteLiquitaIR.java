
public class TesteLiquitaIR {

	public static void main(String[] args) {

		double salario = 3751.0;

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("A sua aliquota � de 7%");
			System.out.println("Voc� pode deduzir at� R$ 142");
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("A sua aliquota � de 15%");
			System.out.println("Voc� pode deduzir at� R$ 350");
		} else if (salario >= 3751.01 && salario <= 4664.0) {
			System.out.println("A sua aliquota � de 22.5%");
			System.out.println("Voc� pode deduzir at� R$ 636");
		} else {
			System.out.println("Voce � muito rica");
		}
	}
}