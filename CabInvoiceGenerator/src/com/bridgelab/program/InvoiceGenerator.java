package com.bridgelab.program;

public class InvoiceGenerator {
		
		private static double MINIMUM_COST_PER_KILOMETER = 10;
		private static int COST_PER_TIME = 1;
		private static double MINIMUM_FARE = 5;
		private static String choice = "premium";
		  public void getRideType(String rideType)
		   {
			   if(rideType.equalsIgnoreCase(choice))
			   {
				   MINIMUM_COST_PER_KILOMETER = 15;
				   COST_PER_TIME = 2;
				   MINIMUM_FARE = 20;
			   }
		   }
		  
		public double CalculateFare(double distance,int time)
		{
			double total_fare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
			if(total_fare < MINIMUM_FARE)
			{
				return MINIMUM_FARE;
			}
			return total_fare;
        }
		
		public EnhancedInvoice CalculateFare(Ride[] rides) {
			double total_fare = 0;
			for(Ride ride: rides) 
				total_fare += this.CalculateFare(ride.distance, ride.time);
			System.out.println(total_fare);
			return new EnhancedInvoice(rides.length,total_fare);
		}  
}
