package entities;

import java.time.LocalDate;

public class CarRental {

	private LocalDate start;
	private LocalDate finish;

	private Vehicle vehicle;
	private Invoice invoice;

	CarRental() {

	}

	public CarRental(LocalDate start, LocalDate finish, Vehicle vehicle, Invoice invoice) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
		this.invoice = invoice;
	}

	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	public LocalDate getFinish() {
		return finish;
	}

	public void setFinish(LocalDate finish) {
		this.finish = finish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

}
