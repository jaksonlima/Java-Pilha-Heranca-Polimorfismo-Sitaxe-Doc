// Composição 

public class AutenticacaoUtil {

	private int senha = 222;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Sua Senha é Valida");
			return true;
		} else {
			System.out.println("Sua Senha é invalida");
			return false;
		}
	}

}
