import java.util.Scanner;

abstract class JavaSkill{
	
	static void doDemo() {
		System.out.println("Demo complete!");
	}
}
class Imports extends JavaSkill{

	static void doDemo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What would you like for lunch?");
		String food = scanner.nextLine();
		System.out.println(food);
		System.out.println("Scanner imported");
	}
	
}
class ControlStatements extends JavaSkill{

	static void doDemo() {
		int x = 1;
		if(x == 1) {
			System.out.println("x = 1");
		}
	}
	
}
class PrimitiveTypes extends JavaSkill{
	static void doDemo() {
		int x = 3;
		double newdouble = 3.3;
		boolean run = true;
		if(run = true) {
			System.out.println(x + " " + newdouble + " is " + run);
		}
	}
}
public class FinalAssignment {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//
		
		String[] skills = {"ControlStatements","Import","PrimitiveTypes","more","moree"};
		for(int i = 0; i <= skills.length; i++) {
			skills[i] = skills[i++];
			if(i == 0) {
				ControlStatements.doDemo();
			}else if(i == 1) {
				Imports.doDemo();
			}else if(i == 2){
				PrimitiveTypes.doDemo();
			}else if(i == 3) {
				JavaSkill.doDemo();
			}
			
		}
	
		//
		
	}
}
