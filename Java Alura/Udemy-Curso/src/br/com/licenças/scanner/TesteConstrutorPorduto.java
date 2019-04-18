package br.com.licenças.scanner;

public class TesteConstrutorPorduto {

	public String name;
	public double price;
	public int quantity;

	public TesteConstrutorPorduto(String nome, Double preco, int quantidade) {
		this.name = nome;
		this.price = preco;
		this.quantity = quantidade;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
