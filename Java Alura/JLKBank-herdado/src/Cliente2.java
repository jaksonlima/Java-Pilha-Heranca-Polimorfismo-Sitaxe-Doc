
public class Cliente2 {
	
	private AutenticacaoUtil autentica;

	public void cliente() {
		this.autentica = new AutenticacaoUtil();
	}

	public void setSenha(int senha) {
		this.autentica.setSenha(senha);
	}

	public boolean autentica(int senha) {
		boolean autenticou = this.autentica.autentica(senha);
		return true;
	}

}
