
public class TestaSistema {
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(222);
		
		Administrador a = new Administrador();
		a.setSenha(222);
		
		SistemaInterno s = new SistemaInterno();
//		s.autentica(g);
		s.autentica(a);
		
	}

}
