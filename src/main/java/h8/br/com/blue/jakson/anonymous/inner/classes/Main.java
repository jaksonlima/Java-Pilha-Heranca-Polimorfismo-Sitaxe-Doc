package h8.br.com.blue.jakson.anonymous.inner.classes;

public class Main {
	
	public static void main(String[] args) {
		
		String texto2 = "Variavel fora";
		
		class Texto{
			private String texto;
			
			public Texto(String texto) {
				this.texto = texto;
			}
			
			public void getTexto() {
				System.out.println(texto);
			}
			
			public void getTexte2() {
				System.out.println(texto2);
			}
		}
		
		Texto mostraText = new Texto("Variavel da Class");
		mostraText.getTexto();
		mostraText.getTexte2();
	}

}
