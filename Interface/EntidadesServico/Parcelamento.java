package EntidadesServico;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import Entidades.Contrato;
import Entidades.Parcela;
import EntidadesInterface.ServicoDePagamento;

public class Parcelamento {
	ServicoDePagamento servico;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Parcelamento(ServicoDePagamento servico) {
		super();
		this.servico = servico;
	}

	public void gerarParcelas(Contrato contrato, int parcelas) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(contrato.getData());
		double parSimp = contrato.getValorTotal() / parcelas;
		for (int i = 0; i < parcelas; i++) {
			cal.add(Calendar.MONTH, 1);
			Date tempDate = cal.getTime();
			Parcela parcela = new Parcela(tempDate,(servico.calculaJuros(parSimp, (i + 1))) + (servico.calculaTaxa(parSimp, (i+1))));
			contrato.addParcela(parcela);
		}
	}
}
//parcelaSimples+(servico.calculaJuros(parcelaSimples, parcelas))+(servico.calculaTaxa(parcelaSimples)