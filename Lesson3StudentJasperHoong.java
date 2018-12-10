
public class Lesson3StudentJasperHoong {
	private String firstName;
	private String lastName;
	private double average;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	
//Constructors	
	public Lesson3StudentJasperHoong() {
		
	}
	public Lesson3StudentJasperHoong(String firstName) {
		this.firstName = firstName;
	}
	public Lesson3StudentJasperHoong(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Lesson3StudentJasperHoong(String firstName, String lastName, double average) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.average = average;
	}
}
