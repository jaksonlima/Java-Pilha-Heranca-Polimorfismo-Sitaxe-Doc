package e5.br.com.blue.jakson.reflection.annotations;

public class MinhaClasse {

	@Executar(value="A")
	public void m1(String param) {
		System.out.println("m1 ()" + param);
	}

	@Executar("B")
	public void m2(String param) {
		System.out.println("m2 ()" + param);
	}

	@Executar("B")
	public void m3(String param) {
		System.out.println("m3 ()" + param);
	}

}
