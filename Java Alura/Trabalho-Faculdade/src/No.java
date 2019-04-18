
public class No {

	No esquerda;
	No direita;
	int valor;

	public No(int valor) {
		this.valor = valor;
	}

	public void inserir(No node, int valor) {
		if (valor < node.valor) {
			if (node.esquerda == null) {
				node.esquerda = new No(valor);
				System.out.println("Inserindo" + valor + "Esquerda do " + node.valor);
			} else {
				inserir(node.esquerda, valor);
			}

		}
		if (valor > node.valor) {
			if (node.direita == null) {
				node.direita = new No(valor);
				System.out.println("Inserindo" + valor + "Direita do " + node.valor);
			} else {
				inserir(node.direita, valor);

			}
		}
	}
}
