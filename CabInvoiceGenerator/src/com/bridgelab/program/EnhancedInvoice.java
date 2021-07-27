package com.bridgelab.program;

public class EnhancedInvoice {
	private int no_of_rides;
	private double total_fare;
	private double average;
	public EnhancedInvoice(int length,double total_fare)
	{
		this.no_of_rides = no_of_rides;
		this.total_fare = total_fare;
		this.average = this.total_fare / this.total_fare;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnhancedInvoice other = (EnhancedInvoice) obj;
		return Double.doubleToLongBits(average) == Double.doubleToLongBits(other.average)
				&& no_of_rides == other.no_of_rides
				&& Double.doubleToLongBits(total_fare) == Double.doubleToLongBits(other.total_fare);
	}

	
}
