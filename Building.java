//Alex Schopler
//Create a class with unique appropriate attributes and behaviors
//implement created interface and method to calculate carbon footprint
public class Building implements CarbonFootprint{
	double kiloWattperHour;
	final int period = 12;

	public Building(double totalConsumption){
		this.kiloWattperHour=totalConsumption;
	}
	
	public double getkiloWattperHour() {
		return kiloWattperHour;
	}
	
	public void setkiloWattperHour(double power) {
		kiloWattperHour = power;
	}

	@Override
	public String toString() {
		return "The total consumption of power in a month for a building is: " + kiloWattperHour;
	}
	
	public double getCarbonFootprint() {
		return this.kiloWattperHour * period;
	}
}
