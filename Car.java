//Alex Schopler
//Create a class with unique appropriate attributes and behaviors
//implement created interface and method to calculate carbon footprint
public class Car implements CarbonFootprint{

	double totalMiles;
	double milesPerGallon;
	final int releasedCarbon = 10;

	public Car(double disInMiles, double numOfMilesPerGallon){
		totalMiles = disInMiles;
		milesPerGallon = numOfMilesPerGallon;
	}

	public void setDistanceInMiles(double milesPerYear)
	{
		totalMiles = milesPerYear;
	}

	public void setMilesPerGallon(double numMile)
	{
		milesPerGallon = numMile;
	}

	public double getDistanceInMiles()
	{
		return totalMiles;
	}

	public double getMilesPerGallon()
	{
		return milesPerGallon;
	}

	@Override
	public String toString()
	{
		return "The average distance in miles per year of a car is: " + totalMiles + " The average distance in miles per gallon of a car is: " + milesPerGallon;
	}

	public double getCarbonFootprint()
	{
		return((getDistanceInMiles() *getMilesPerGallon()) * releasedCarbon);
	}
}
