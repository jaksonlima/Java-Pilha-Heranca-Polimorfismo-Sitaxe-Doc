
public class TestaConversao {

	public static void main(String[] args) {
		
		double salario = 1250.5;
		int valor = (int) salario;		
		System.out.println(valor);
		
		long x = 20000000000000l;
		System.out.println(x);
		
		short valorPequeno = 5132;
		System.out.println(valorPequeno);
		
		byte valorSuperPequeno = 102;
		System.out.println(valorSuperPequeno);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1+valor2;		
		System.out.println(total);
		
		float PontoFlutuante = 3.14f;
		System.out.println(PontoFlutuante);
	}
}
