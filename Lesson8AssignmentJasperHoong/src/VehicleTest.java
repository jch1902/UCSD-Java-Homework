import java.util.ArrayList;

public class VehicleTest {

	public static void main(String[] args) {
		Car car = new Car("Ford", "Mustang",4,400,5,6);
		Car car1 = new Car("Mitsubishi", "Eclipse",4,500,6,6);
		Car car2 = new Car("Toyota","Prius",4,130,5,5);
		PickupTruck truck = new PickupTruck("Ford","F-150",4,200,7,7);
		PickupTruck truck1 = new PickupTruck("Chevrolet","Silverado",4,200,8,7);
		PickupTruck truck2 = new PickupTruck("Ram","1500",4,190,7,6);
		
		
		ArrayList<Diagnostics> vehicles = new ArrayList<Diagnostics>();
		vehicles.add(car);
		vehicles.add(car1);
		vehicles.add(car2);
		vehicles.add(truck);
		vehicles.add(truck1);
		vehicles.add(truck2);
		for(Diagnostics run : vehicles) {
			run.runDiagnostics();
		}
		
	}


	
		
		
	

}