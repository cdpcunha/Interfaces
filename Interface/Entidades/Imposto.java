package Entidades;

public class Imposto {
	public static double calculaImposto(double quantia) {
		if(quantia < 100) {
			return quantia * 0.2;
		}
		else return quantia * 0.15;
	}
}
