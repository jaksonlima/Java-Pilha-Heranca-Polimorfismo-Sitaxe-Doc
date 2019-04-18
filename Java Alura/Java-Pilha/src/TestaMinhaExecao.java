
public class TestaMinhaExecao {
	
	public static void main(String[] args) {
		
		Conta c = new Conta();
		try {
			c.deposita();
		}catch(MinhaException ex) {
			System.out.println("Minha Execao Com erro");
		}
				
	}

}
