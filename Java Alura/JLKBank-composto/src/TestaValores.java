
public class TestaValores {
	public static void main(String[] args) {
		
		Conta contaJakson = new Conta(1997, 1909);/*MAIS UMA CONTA CRIADA*/

		System.out.println(contaJakson.getAgencia());

		System.out.println(contaJakson.numero);

		Conta contabruna = new Conta(1997, 1910);/*MAIS UMA CONTA CRIADA*/

		System.out.println(contabruna.getAgencia());

		System.out.println(contabruna.numero);
		
//		System.out.println(Conta.total);/*TOTAL DE CONTAS DA MINHA CLASS CONTA*/
		
		System.out.println(contabruna.getTotal());
		
		System.out.println(contaJakson.getTotal());
		
		System.out.println(Conta.getTotal());
		
		

	}

}
