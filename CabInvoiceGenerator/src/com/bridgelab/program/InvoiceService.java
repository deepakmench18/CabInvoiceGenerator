package com.bridgelab.program;

public class InvoiceService {
	private static  String invoice ;
	private String userID;
	private Ride[] rides;
	private EnhancedInvoice totalfare;
	private EnhancedInvoice total_fare;

	public InvoiceService(String userID, Ride[] rides) {
		this.userID = userID;
		this.rides = rides;
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		this.total_fare = invoiceGenerator.CalculateFare(rides);
		this.invoice = userID+", "+rides+", "+totalfare;
	}

}
