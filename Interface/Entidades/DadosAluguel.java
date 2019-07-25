package Entidades;

import java.util.Date;

public class DadosAluguel {
	private Date saida;
	private Date retorno;
	private Veiculo veiculo;
	private Boleto boleto;
	
	public DadosAluguel(Date saida, Date retorno, Veiculo veiculo) {
		super();
		this.saida = saida;
		this.retorno = retorno;
		this.veiculo = veiculo;
	}
	
	public DadosAluguel() {
	}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
	}

	public Date getRetorno() {
		return retorno;
	}

	public void setRetorno(Date retorno) {
		this.retorno = retorno;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Boleto getBoleto() {
		return boleto;
	}

	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}
}
