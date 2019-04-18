
public class Gerente extends FuncionarioAutenticavel {
	private int senha;
	private int autenticador;

	public boolean getAutenticador() {
		if(senha == autenticador) {
			return true;
		}else {
			return false;
		}
	}

	public boolean setAutenticador(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

//	public void setSalario(double salario) {
//		super.getSalario() = salario;
//	}
//	public double getSalario() {
//		return super.getSalario() * 1.2;
//	}
//
//	public int getSenha() {
//		return this.senha;
//	}
//
//	public void setSenha(int senha) {
//		this.senha = senha;
//	}
//	
//	public double getBonificacao() {
//		System.out.println("gerente");
//		return + 100 + getSalario();
//				super.getBonificacao() + super.getSalario();
	}
}
