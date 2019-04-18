
public class Administrador2 {

	private AutenticacaoUtil autentica;

	public void administrador() {
		this.autentica = new AutenticacaoUtil();
	}

	public void setSenha(int senha) {
		this.autentica.setSenha(senha);
	}

	public boolean autentica(int senha) {
		boolean autentica = this.autentica.autentica(senha);
		return true;
	}

}
