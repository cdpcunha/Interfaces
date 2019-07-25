package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class AluguelMeu {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	private String modelo;
	private Date saida;
	private Date retorno;
	private double vlrHora;
	private double vlrDia;

	public AluguelMeu(String modelo, Date saida, Date retorno, double vlrHora, double vlrDia) {
		super();
		this.modelo = modelo;
		this.saida = saida;
		this.retorno = retorno;
		this.vlrHora = vlrHora;
		this.vlrDia = vlrDia;
	}

	public AluguelMeu(String modelo, Date saida, Date retorno) {
		super();
		this.modelo = modelo;
		this.saida = saida;
		this.retorno = retorno;
	}

	public AluguelMeu() {
	}

	public String getModelo() {
		return modelo;
	}

	public Date getSaida() {
		return saida;
	}

	public Date getRetorno() {
		return retorno;
	}

	public void setRetorno(Date retorno) {
		this.retorno = retorno;
	}

	public Double calculaDuracao() {
		long t1 = this.saida.getTime();
		long t2 = this.retorno.getTime();
		double horas = (double)(t2-t1)/1000/60/60;
		return Math.ceil(horas);
	}

	public double calculaBase() {
		if (this.calculaDuracao() <= 12) {
			return (calculaDuracao() * this.vlrHora);
		} else
			return (Math.ceil(calculaDuracao() / 24)) * this.vlrDia;
	}

	public double calculaImp() {
		if (calculaBase() <= 100) {
			return calculaBase() * 0.2;
		} else
			return calculaBase() * 0.15;
	}

	@Override
	public String toString() {
		return "Duração de "+sdf.format(this.saida)+" até "+sdf.format(this.retorno)+" = " + calculaDuracao() +" Horas"
			+ "\nPagamento Base = " + calculaBase()
			+ "\nTotal de Impostos = " +  calculaImp()
			+ "\nTotal a Pagar : " + (calculaBase()+calculaImp());
	}
}
