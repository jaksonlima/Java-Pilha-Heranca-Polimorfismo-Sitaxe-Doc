package d4.br.com.blue.jakson.reflection;

public class Televisao {
	
	private boolean ligada;
	private int canal;
	
	public Televisao(boolean ligada, int canal) {
		this.ligada = ligada;
		this.canal = canal;
	}
	
	public Televisao() {
		System.out.println("Televi�o ligada");
	}
	
	public void ligar() {
		this.ligada = true;
		System.out.println("Televisao Ligada");
	}
	
	public void desligada() {
		this.ligada = false;
		System.out.println("Televisao Desligada");
	}
	
	public void mudarCanal(int novocanal) {
		this.canal = novocanal;
		System.out.println("Canal mudado para " + novocanal);
	}
	
	public boolean isLigada() {
		return this.ligada;
	}
	
	public int getCanal() {
		return this.canal;
	}
		
}
