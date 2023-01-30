package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.CarRental;
import entities.Vehicle;
import services.BrazilTaxService;
import services.RentalService;

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

		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

		System.out.println("Entre com o preço por hora:");
		Double pricePerHour = sc.nextDouble();
		System.out.println("Entre com o preço por dia:");
		Double pricePerDay = sc.nextDouble();

		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		rentalService.processInvoice(cr);

		System.out.println("FATURA:");
		System.out.println("Pagamento basico:" + cr.getInvoice().getBasicPayment());
		System.out.println("Imposto:" + cr.getInvoice().getTax());
		System.out.println("Pagamento total:" + cr.getInvoice().getTotalPayment());

		sc.close();
	}

}
