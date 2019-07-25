package Entidades;

import EntidadesInterface.ImpostoInterface;

public class ImpostoBrasileiro implements ImpostoInterface{
	public double calculaImposto(double quantia) {
		if(quantia < 100) {
			return quantia * 0.2;
		}
		else return quantia * 0.15;
	}
}
