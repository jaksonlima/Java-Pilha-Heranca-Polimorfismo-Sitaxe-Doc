package b.br.com.blue.jakson.GenericsParametrizadas;

public class Main {
	public static void main(String[] args) {

//		Buffer b = new Buffer();
//
//		b.adicionar("a");
//		b.adicionar("b");
//		b.adicionar("c");
//
//		String e1 = b.remover();
//		String e2 = b.remover();
//		String e3 = b.remover();
//
//		System.out.println(e1 + ", " + e2 + ", " + e3);

		GenericsParametrizadas<String> b = new GenericsParametrizadas<String>();

		b.adicionar("a");
		b.adicionar("b");
		b.adicionar("c");

		String e1 = b.remover();
		String e2 = b.remover();
		String e3 = b.remover();

		System.out.println(e1 + ", " + e2 + ", " + e3);

		GenericsParametrizadas<Integer> bi = new GenericsParametrizadas<Integer>();

		bi.adicionar(1);
		bi.adicionar(2);
		bi.adicionar(3);

		Integer i1 = bi.remover();
		Integer i2 = bi.remover();
		Integer i3 = bi.remover();

		System.out.println(i1 + ", " + i2 + ", " + i3);

	}
}
