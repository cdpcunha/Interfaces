package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dtVenc;
	private Double vlrParcela;
	
	public Parcela(Date dtVenc, Double vlrParcela) {
		super();
		this.dtVenc = dtVenc;
		this.vlrParcela = vlrParcela;
	}
	
	public Parcela() {
	}

	public Date getDtVenc() {
		return dtVenc;
	}

	public void setDtVenc(Date dtVenc) {
		this.dtVenc = dtVenc;
	}

	public Double getVlrParcela() {
		return vlrParcela;
	}

	public void setVlrParcela(Double vlrParcela) {
		this.vlrParcela = vlrParcela;
	}

	@Override
	public String toString() {
		return "\nVencimento = " + sdf.format(dtVenc) + " , Parcela = " + String.format("%.2f",vlrParcela);
	}
	
}
