package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entidades.DadosAluguel;
import Entidades.Imposto;
import Entidades.ServicoAluguel;
import Entidades.Veiculo;

public class Locadora {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Scanner sc = new Scanner(System.in);

		try {
		System.out.println("  Entre com os dados do veículo e aluguel  ");
		System.out.print("Modelo : ");
		String modelo = sc.nextLine();
		Veiculo veiculo = new Veiculo(modelo);
		
		System.out.print("Data de retirada (dd/MM/yyyy hh:mm):");
		Date dtSaida = sdf.parse(sc.nextLine());
		System.out.print("Data de devolução (dd/MM/yyyy hh:mm):");
		Date dtDevol = sdf.parse(sc.nextLine());
		DadosAluguel  dadosAluguel = new DadosAluguel(dtSaida, dtDevol, veiculo);
		
		System.out.print("Preço por hora : ");
		double precoHora = sc.nextDouble();
		System.out.print("Preço por dia : ");
		double precoDia = sc.nextDouble();
		ServicoAluguel aluguel = new ServicoAluguel(precoHora, precoDia, new Imposto());
		
		aluguel.processaBoleto(dadosAluguel);	
		
		System.out.println("  Boleto  ");
		System.out.println("Pagamento Base : "+dadosAluguel.getBoleto().getPagamentoBase());
		System.out.println("Impóstos : "+dadosAluguel.getBoleto().getImposto());
		System.out.println("Pagamento Total : "+dadosAluguel.getBoleto().totalPgto());
		}
		catch(ParseException e) {
			System.out.println(e.getLocalizedMessage());
		}
		finally {
			sc.close();
		}
	}

}
