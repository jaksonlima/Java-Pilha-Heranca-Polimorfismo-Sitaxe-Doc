
public class ControleBonificacao {

	private double soma;

	public void registra(Funcionario g1) {    
		double boni = g1.getBonificacao();  //Chama o metodo de bonificação
		this.soma = this.soma + boni;  
	}

	public double getSoma() {  // Me da o valor da Soma Total//
		return this.soma;
	}

}
