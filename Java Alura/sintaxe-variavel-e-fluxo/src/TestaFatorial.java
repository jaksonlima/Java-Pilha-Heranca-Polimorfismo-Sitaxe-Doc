
public class TestaFatorial {
	public static void main(String[] args) {

//		int fatorial = 1;
//
//		for (int numero = 1; numero <= 10; numero = numero + 1) {
//
//			fatorial = fatorial + numero;
//
//			System.out.println(fatorial);
		
		
		int fatorial = 1;
		
        for (int i = 1; i < 11; i = i + 1) {
        	
            fatorial = fatorial * i;
            
            System.out.println("Fatorial de " + i + " = " +fatorial);
		
		}
	}

} 
