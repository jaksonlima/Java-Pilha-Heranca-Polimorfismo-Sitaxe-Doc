
public class TestaUtil2 {
	
	public static void main(String[] args) {
		
		Gerente2 g = new Gerente2();
		g.setSenha(222);
		
		Cliente2 c = new Cliente2();
		c.setSenha(333);
		
		Administrador2 d = new Administrador2();
		d.setSenha(444);
		
		System.out.println(g.autentica(222));
		
		
	}

}
