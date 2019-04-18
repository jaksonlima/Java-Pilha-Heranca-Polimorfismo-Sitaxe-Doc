
public class TestaHerdado {
	public static void main(String[] args) {
		Gerente jakson = new Gerente();
		jakson.setSalario(5000);
//		jakson.setAutenticador(222);
//		boolean autentica = jakson.getAutenticador();

		System.out.println(jakson.getSalario());
		System.out.println(jakson.getBonificacao());
//		System.out.println(autentica);

//		Funcionario bruna = new Funcionario();
//		bruna.setSalario(4500);
//
//		System.out.println(bruna.getSalario());
//		System.out.println(bruna.getBonificacao());

	}

}
