package Entidades;

import EntidadesInterface.ImpostoInterface;

public class ServicoAluguel {
	private double vlrHora;
	private double vlrDia;
	private ImpostoInterface imposto;
	
	
	public ServicoAluguel(double vlrHora, double vlrDia, ImpostoInterface imposto) {
		super();
		this.vlrHora = vlrHora;
		this.vlrDia = vlrDia;
		this.imposto = imposto;
	}
	
	public ServicoAluguel() {
	
	}

	public void processaBoleto (DadosAluguel aluguel) {
		long t1 = aluguel.getSaida().getTime();
		long t2 = aluguel.getRetorno().getTime();
		double horas = (double)(t2-t1)/1000/60/60;
		double pgtoBase;		
		if (horas <= 12) {
			pgtoBase = Math.ceil(horas) * this.vlrHora;
		} else
			pgtoBase = Math.ceil(horas / 24) * this.vlrDia;
		
		double impostoTotal = imposto.calculaImposto(pgtoBase);
		aluguel.setBoleto(new Boleto(pgtoBase, impostoTotal));
	}		
}

