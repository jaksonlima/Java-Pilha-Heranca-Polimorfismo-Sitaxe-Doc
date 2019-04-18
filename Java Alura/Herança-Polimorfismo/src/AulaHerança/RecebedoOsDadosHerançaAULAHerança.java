package AulaHerança;

public class RecebedoOsDadosHerançaAULAHerança extends Herança {

	private String NomeDoAluno;
	private Double HoraAula;
	private Integer Idade;

	public RecebedoOsDadosHerançaAULAHerança(String nome, Double numero, Integer cliente, String nomeDoAluno,
			Double horaAula, Integer idade) {
		super(nome, numero, cliente);
		this.NomeDoAluno = nomeDoAluno;
		this.HoraAula = horaAula;
		this.Idade = idade;
	}

	public String getNomeDoAluno() {
		return NomeDoAluno;
	}

	public void setNomeDoAluno(String nomeDoAluno) {
		this.NomeDoAluno = nomeDoAluno;
	}

	public Double getHoraAula() {
		return HoraAula;
	}

	public void setHoraAula(Double horaAula) {
		this.HoraAula = horaAula;
	}

	public Integer getIdade() {
		return Idade;
	}

	public void setIdade(Integer idade) {
		Idade = idade;
	}

	public void setNome(String nome) {
		super.getNome();
	}

	public String seuNomeHeranca() {
		return super.getNome();
	}

}
