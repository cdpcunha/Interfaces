package Entidades;

public class ServicoAluguel {
	private double vlrHora;
	private double vlrDia;
	private Imposto imposto;
	
	
	public ServicoAluguel(double vlrHora, double vlrDia, Imposto imposto) {
		super();
		this.vlrHora = vlrHora;
		this.vlrDia = vlrDia;
		this.imposto = imposto;
	}
	
	public ServicoAluguel() {
	
	}

	public double getVlrHora() {
		return vlrHora;
	}

	public void setVlrHora(double vlrHora) {
		this.vlrHora = vlrHora;
	}

	public double getVlrDia() {
		return vlrDia;
	}

	public void setVlrDia(double vlrDia) {
		this.vlrDia = vlrDia;
	}

	public Imposto getImposto() {
		return imposto;
	}

	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
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
		
		double impostoTotal = Imposto.calculaImposto(pgtoBase);
		aluguel.setBoleto(new Boleto(pgtoBase, impostoTotal));
	}		
}

