package AulaHeran�a;

public class Heran�a {

	private String nome;
	private Double numero;
	private Integer cliente;

	public Heran�a(String nome, Double numero, Integer cliente) {
		this.nome = nome;
		this.numero = numero;
		this.cliente = cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNumero() {
		return numero;
	}

	public void setNumero(Double numero) {
		this.numero = numero;
	}

	public Integer getCliente() {
		return cliente;
	}

	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}

}
