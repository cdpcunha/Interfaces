package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entidades.Contrato;
import Entidades.Parcela;
import Entidades.Paypal;
import EntidadesServico.Parcelamento;

public class ContratosServicos {

	public static void main(String[] args) throws ParseException {
		
		System.out.printf("%.2f",(200+(200*0.01*2)));
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("---Dados do Contrato---");
		System.out.print("Número do contrato : ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Data de Assinatura :  ");
		Date data = sdf.parse(sc.nextLine());
		System.out.println("Valor total do Contrato : ");
		double valorTotal = sc.nextDouble();
		Contrato contrato = new Contrato(numero, data, valorTotal);

		System.out.println("Quantidade de Parcelas : ");
		int qtdParcelas = sc.nextInt();
		sc.nextLine();
		Parcelamento parcelamento = new Parcelamento(new Paypal());
		parcelamento.gerarParcelas(contrato, qtdParcelas);

		System.out.println("-- Parcelamento --");
		for (Parcela p : contrato.getParcelas()) {
			System.out.println(p);
		}

		sc.close();
	}

}
