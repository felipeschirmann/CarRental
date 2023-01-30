package services;

import entities.CarRental;
import entities.Invoice;

public class RentalService {
	private Double pricePerHour;
	private Double pricePerday;

	private BrazilTaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerday, BrazilTaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerday = pricePerday;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		carRental.setInvoice(new Invoice());
	}
}
