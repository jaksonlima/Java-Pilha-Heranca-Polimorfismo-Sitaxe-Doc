package entidades;

import java.util.ArrayList;
import java.util.List;

import entidades.enums.TrabalhadorLevel;

public class Trabalhador {

	private String name;
	private TrabalhadorLevel level;
	private Double basesalarial;

	private Departamento departamento;
	private List<Contrato> contratos = new ArrayList<Contrato>();

	public Trabalhador() {
	}

	public Trabalhador(String name, TrabalhadorLevel level, Double basesalarial, Departamento departamento) {
		this.name = name;
		this.level = level;
		this.basesalarial = basesalarial;
		this.departamento = departamento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TrabalhadorLevel getLevel() {
		return level;
	}

	public void setLevel(TrabalhadorLevel level) {
		this.level = level;
	}

	public Double getBasesalarial() {
		return basesalarial;
	}

	public void setBasesalarial(Double basesalarial) {
		this.basesalarial = basesalarial;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}

	public void addcontrato(Contrato contrato) {
		contratos.add(contrato);
	}

	public void removeContrato(Contrato contrato) {
		contratos.remove(contrato);
	}

}
