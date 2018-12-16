public class PickupTruck extends Vehicle implements Diagnostics{
	private double bedWidth;
	private double bedLength;

	public PickupTruck(String vendor, String model, int numWheels, int speed, double bedLength,double bedWidth) {
		super(vendor,model,numWheels,speed);
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
		return(vendor + " " + model + ", " + numWheels + " wheel(s), " + speed  + " maxSpeed " + bedWidth + " bedWidth, " + bedLength + " bedLength " );
	}

	@Override
	public int getSpeed() {
		return this.speed = speed;
	}

	@Override
	public void runDiagnostics() {
		System.out.println(this.toString());
	}

}