
public class TesteReferencias {
	public static void main(String[] args) {

		Gerente G = new Gerente();
		G.setSalario(5000);

//		Funcionario D = new Designer();
//		D.setSalario(6000);
		

		Funcionario E = new EditorDeVideo();
		E.setSalario(4000);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(G);
//		controle.registra(D);
//		controle.registra(E);

		System.out.println(controle.getSoma());

	}
}
