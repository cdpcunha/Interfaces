package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import Entidades.AluguelMeu;

public class LocadoraMeu {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("  Entre com os dados do ve�culo e aluguel  ");
		System.out.print("Modelo : ");
		String modelo = sc.nextLine();
		System.out.print("Data de retirada (dd/MM/yyyy hh:mm):");
		Date dtSaida = sdf.parse(sc.nextLine());
		System.out.print("Data de devolu��o (dd/MM/yyyy hh:mm):");
		Date dtDevol = sdf.parse(sc.nextLine());
		System.out.print("Pre�o por hora : ");
		double precoHora = sc.nextDouble();
		System.out.print("Pre�o por dia : ");
		double precoDia = sc.nextDouble();
		AluguelMeu aluguel = new AluguelMeu(modelo, dtSaida, dtDevol, precoHora, precoDia);
		System.out.println(aluguel);
		}
		catch(ParseException e) {
			System.out.println(e.getLocalizedMessage());
		}
		finally {
			sc.close();
		}
	}

}
