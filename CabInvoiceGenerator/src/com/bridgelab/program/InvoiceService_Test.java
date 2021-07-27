package com.bridgelab.program;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceService_Test {
	InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
	
    @Test
    public void givenDistanceAndTime_ReturnTotalFare(){
    	double distance = 2.0;
    	int time = 5;
    	double fare = invoiceGenerator.CalculateFare(distance, time);
    	Assert.assertEquals(25, fare, 0.0); 
    }
    
    @Test
    public void DistanceandTime_return_MinFare(){

    	double distance = 0.1;
    	int time = 1;
    	double fare = invoiceGenerator.CalculateFare(distance, time);
    	Assert.assertEquals(5, fare, 0.0);
    }
    
    @Test
    public void MultipleRide_returns_EnhancedInvoice(){
    	Ride rides[] = { new Ride(2.0, 1),
    			new Ride(3.0, 2),
    			new Ride(4.0, 3)};
    	EnhancedInvoice fare = invoiceGenerator.CalculateFare(rides);
    	EnhancedInvoice expectedInvoice = new EnhancedInvoice(3,96);
    	Assert.assertEquals(expectedInvoice, fare);
    }
    
    @Test
    public void MultipleRide_ReturnInvoice(){
    	Ride rides[] = { new Ride(2.0, 1),
    			new Ride(3.0, 5),
    			new Ride(6.0, 6),
    			new Ride(8.9, 1),
    			new Ride(9.0, 9) };
    	String userID = "Deepak";
    	InvoiceService invoice = new InvoiceService(userID, rides);
    	Assert.assertNotNull(invoice);
    }
    
    @Test
    public void givenMultipleRides_ArePremium(){
    	double distance = 1;
    	int time = 1;
    	String RideType = "Premium";
    	invoiceGenerator.getRideType(RideType);
    	double fare = invoiceGenerator.CalculateFare(distance, time);
    	Assert.assertEquals(20, fare, 0.0);
    }
}