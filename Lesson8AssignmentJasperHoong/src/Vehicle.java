public abstract class Vehicle{

	protected int numWheels;
	protected int speed;
	protected String vendor;
	protected String model;
	
	public Vehicle(String vendor, String model, int numWheels, int speed) {
		
		this.numWheels = numWheels;
		this.speed = speed;
		this.vendor = vendor;
		this.model = model;
	}
	
	public int getNumWheels() {
		return numWheels;
	}
	public abstract int getSpeed();
	
	public String getVendor() {
		return vendor;
	}
	public String getModel() {
		return model;
	}
	public String toString() {
		return(vendor + " " + model + ", " + numWheels + " wheel(s), " + speed  + " maxSpeed " );
	}
	
	
}