package Entidades;

import EntidadesInterface.ServicoDePagamento;

public class Paypal implements ServicoDePagamento {
	
	@Override
	public double calculaJuros(double quantia, int mes) {
		return quantia+(quantia* 0.01 * mes);
	}

	@Override
	public double calculaTaxa(double quantia,int mes) {
		return calculaJuros(quantia, mes)*0.02;
	}
}
