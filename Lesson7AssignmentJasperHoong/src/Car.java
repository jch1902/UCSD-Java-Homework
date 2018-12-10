
public class Car extends Vehicle{
	private double trunkWidth;
	private double trunkLength;

	public Car(String vendor, String model, int numWheels, int speed, double trunkLength,double trunkWidth,double diameter) {
		super(vendor,model,numWheels,speed,diameter);
		this.trunkWidth = trunkWidth;
		this.trunkLength = trunkLength;
	}
	public double getTrunkWidth() {
		return trunkWidth;
	}
	public double getTrunkLength() {
		return trunkLength;
	}
}
