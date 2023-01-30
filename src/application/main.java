package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro:");
		String carModel = sc.nextLine();
		System.out.println();
		System.out.println("Retirada (dd/MM/yyyy hh:mm):");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("Retorno (dd/MM/yyyy hh:mm):");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

		sc.close();
	}

}