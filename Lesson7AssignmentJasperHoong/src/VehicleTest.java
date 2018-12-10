
public class VehicleTest {

	public static void main(String[] args) {
		Car car = new Car("Ford", "Mustang", 4, 400, 5, 6,10);
		Car car1 = new Car("Mitsubishi", "Eclipse" , 4 , 500 , 6 , 6,10);
		Car car2 = new Car("Toyota","Prius", 4 , 130 , 5 , 5,10);
		PickupTruck truck = new PickupTruck("Ford","F-150",4,200,7,7,10);
		PickupTruck truck1 = new PickupTruck("Chevrolet","Silverado",4,200,8,7,10);
		PickupTruck truck2 = new PickupTruck("Ram","1500",4,190,7,6,10);
		
		
		System.out.println(car);
		System.out.println();
		System.out.println(car1);
		System.out.println();
		System.out.println(car2);
		System.out.println();
		System.out.println(truck);
		System.out.println();
		System.out.println(truck1);
		System.out.println();
		System.out.println(truck2);
		
	}


	
		
		
	

}
