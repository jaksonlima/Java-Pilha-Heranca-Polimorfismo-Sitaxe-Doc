
public class TestaLacos3 {
	public static void main(String[] args) {
		for(int linha = 0; linha <= 5; linha = linha +1) {
			for(int coluna = 0; coluna <= 5; coluna = coluna + 1) {
				if(coluna > linha) {
					break;
				}
				System.out.print(coluna+1);
				//System.out.print(" ");
			}
			System.out.println();
		}
	}

}
