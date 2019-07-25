package EntidadesInterface;

public interface ServicoDePagamento {
	public double calculaJuros (double quantia, int meses) ;
	public double calculaTaxa(double quantia, int mes);
}
