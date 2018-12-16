public class Car extends Vehicle implements Diagnostics{
	private double trunkWidth;
	private double trunkLength;

	public Car(String vendor, String model, int numWheels, int speed, double trunkLength,double trunkWidth) {
		super(vendor,model,numWheels,speed);
		this.trunkWidth = trunkWidth;
		this.trunkLength = trunkLength;
	}
	public double getTrunkWidth() {
		return trunkWidth;
	}
	public double getTrunkLength() {
		return trunkLength;
	}
	public int getSpeed() {
		return this.speed = speed;
	}
	@Override
	public void runDiagnostics() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
	}
}