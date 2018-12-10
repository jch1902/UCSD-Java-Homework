import java.util.Scanner;

public class Lesson3StudentTestJasperHoong {

	public static void main(String[] args) {
	//Name
		Scanner input = new Scanner(System.in);
		System.out.println("What's your first name?");
		String fname = input.nextLine();
		System.out.println("What's your last name?");
		String lname = input.nextLine();
	//Grade
		int gradeAverage = 0;
		int total = 0; int gradeCounter = 0;
		System.out.println("What's your grade?(Enter -1 to finish)");
		int grade = input.nextInt();
		while(grade != -1) {
			total = total + grade;
			gradeCounter = gradeCounter + 1;
			System.out.println("Enter grade or -1 to quit");
			grade = input.nextInt();
		}
		if(gradeCounter != 0) {
			 gradeAverage = total / gradeCounter;
		}
		
		
		
		
		
// Show everything
		Lesson3StudentJasperHoong student = new Lesson3StudentJasperHoong(fname, lname, gradeAverage);
		System.out.println("Hello " + student.getFirstName() + " " +  student.getLastName() + ", your grade is: " + student.getAverage());
	}

}
