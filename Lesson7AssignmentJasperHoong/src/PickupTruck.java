
public class PickupTruck extends Vehicle{
	private double bedWidth;
	private double bedLength;

	public PickupTruck(String vendor, String model, int numWheels, int speed, double bedLength,double bedWidth,double diameter) {
		super(vendor,model,numWheels,speed,diameter);
		this.bedWidth = bedWidth;
		this.bedLength = bedLength;
	}
		
	public double getBedWidth() {
		return bedWidth;
	}
	public double getBedLength() {
		return bedLength;
	}
	public String toString() {
		return(vendor + " " + model + ", " + numWheels + " wheel(s), " + speed  + " maxSpeed " + bedWidth + " bedWidth, " + bedLength + " bedLength " + diameter + "(Diameter)");
	}

}
