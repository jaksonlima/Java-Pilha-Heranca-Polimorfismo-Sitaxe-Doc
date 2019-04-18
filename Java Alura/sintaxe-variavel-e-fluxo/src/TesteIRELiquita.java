
public class TesteIRELiquita {
	
	public static void main (String [] args) {
		
        double salario = 3800.0;

        if(salario <= 3700.0) {
            System.out.println("A sua aliquota é de 15%");
            System.out.println("Você pode deduzir até R$ 350");
        } else {
        	 if(salario >= 3800.0) {
                 System.out.println("A sua aliquota é de 22,5%");
                 System.out.println("Você pode deduzir até R$ 636");
                 } else {                	 
                	 System.out.println("Voce nao possui nem uma taxa de liquita");
                 }
        
        }
	}

}
