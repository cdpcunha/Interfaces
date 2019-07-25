package Entidades;

public class Boleto {
	private double pagamentoBase;
	private double imposto;
	
	public Boleto(double pagamentoBase, double imposto) {
		super();
		this.pagamentoBase = pagamentoBase;
		this.imposto = imposto;
	}
	
	public Boleto() {
	}

	public double totalPgto () {
		return this.pagamentoBase + this.imposto;
	}

	public double getPagamentoBase() {
		return pagamentoBase;
	}

	public void setPagamentoBase(double pagamentoBase) {
		this.pagamentoBase = pagamentoBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
}
