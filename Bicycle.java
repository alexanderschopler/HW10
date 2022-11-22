//Alex Schopler
//Create a class with unique appropriate attributes and behaviors
//implement created interface and method to calculate carbon footprint
public class Bicycle implements CarbonFootprint{
	double miles;
	final int CO2emissions = 40;
	
	public Bicycle(double miles) {
		this.miles = miles;
	}
	
	public double getMiles() {
		return miles;
	}
	
	public void setMiles(double miles) {
		this.miles = miles;
	}
	
	@Override
	public String toString() {
		return "The average distance in miles per year of a bicycle is: " + miles;
	}
	
	public double getCarbonFootprint() {
		return miles * CO2emissions;
	}
}
