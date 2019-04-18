package entidades;

import java.util.Date;

public class Contrato {

	private Date date;
	private Double valorPorHor;
	private Integer horas;

	public Contrato() {
	}

	public Contrato(Date data, Double valorporhora, Integer horas) {
		this.date = data;
		this.valorPorHor = valorporhora;
		this.horas = horas;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValorPorHor() {
		return valorPorHor;
	}

	public void setValorPorHor(Double valorPorHor) {
		this.valorPorHor = valorPorHor;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	
}
