package k11.br.com.blue.jakson.lambda.interfaces.funcionais;

public class Main {
	public static void main(String[] args) {

//		Calculator calc = new Calculator() {
//			
//			@Override
//			public void calcular(int x, int b) {
//				x = x * b;
//				System.out.println("Valor total: " + x);
//			}
//		};
//		
//		calc.calcular(10,10);
//	}

		Calculator2 calc2 = (x) -> x * x;
		
		System.out.println("Calcular 2: " + calc2.calcular(1));
		
		Calculator2 calc4 = (x) ->{
			x = x * x;
			return x;
		};
		
		System.out.println("Calcular 2: " + calc4.calcular(2));

		Calculator calc3 = (x) -> {
			x = x * x;
			System.out.println("Calcular sem retorn methd 'void': " + x);
		};
		
    	calc3.calcular(3);
    	
    	Calculator3 calc5 = (x , y) -> x * y;
    	
    	System.out.println("Calculator 3: " + calc5.calcular(10, 10));
    	
    	Calculator3 calc6 = (x, y) ->{
    		return  x = x * y;
    	};
    	
    	System.out.println("Calculator 3: " + calc6.calcular(10, 5));
		
	}
}
