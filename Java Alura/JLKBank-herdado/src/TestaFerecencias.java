
public class TestaFerecencias {
	public static void main(String[] args) {
		 
		Gerente G = new Gerente();
		G.setSalario(100);
		
		System.out.println(G.getSalario());

		
		Designer D = new Designer();
		D.setSalario(200);
		
		EditorDeVideo E = new EditorDeVideo();
		E.setSalario(300);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(G);
		
		System.out.println(G.getSalario());
		
	}

}
