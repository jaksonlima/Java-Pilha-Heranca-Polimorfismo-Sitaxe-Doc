
public class TestaLacos2 {
	public static void main(String[] args) {
		for(int linha = 1; linha < 6; linha = linha + 1) {
			for(int coluna = 1; coluna < 6; coluna = coluna +1) {
				if(coluna > linha) {
					break;
				}
				System.out.print("jakson");
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
