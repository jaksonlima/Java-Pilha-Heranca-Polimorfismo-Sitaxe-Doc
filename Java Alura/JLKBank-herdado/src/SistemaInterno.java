
public class SistemaInterno  {
	
	private int senha = 222;
	
	public void autentica(FuncionarioAutenticavel senha) {
		boolean autentica = senha.autentica(this.senha);
		if(autentica) {
			System.out.println("Pode entrar no Sistema");
		}else {
			System.out.println("N�o pode entrar no Sistema");
		}
		
	}

}
