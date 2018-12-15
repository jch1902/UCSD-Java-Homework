import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

abstract class JavaSkill{
	
	static void doDemo() {
		System.out.println("Demo complete!");
	}
}
class Imports extends JavaSkill{

	static void doDemo() {
		System.out.println();
		System.out.println("Imports");
		Scanner scanner = new Scanner(System.in);
		System.out.println("What would you like for lunch?");
		String food = scanner.nextLine();
		System.out.println(food);
		System.out.println("Scanner imported");
	}
	
}
class ControlStatements extends JavaSkill{

	static void doDemo() {
		System.out.println();
		System.out.println("Control Statements");
		int x = 1;
		if(x == 1) {
			System.out.println("x = 1");
		}else {
			System.out.println("x doesn't equal 1");
		}
		int i = 2;
		switch(i) {
		case 0:
		case 1:
			System.out.println("i is" + i);
			break;
		case 2:
			System.out.println("i is 3");
			break;
		default:
			System.out.println("default case");
		}
		for(int y = 0; y < 3; y++) {
			System.out.println(y);
			if(y == 0) {
				System.out.println("zero");
			}else if(y == 1) {
				System.out.println("one");
			}else if(y == 2) {
				System.out.println("two");
			}
			while( y == -1) {
				System.out.println("Why is y -1");
			}
		}
	}
	
}
class PrimitiveTypes extends JavaSkill{
	static void doDemo() {
		System.out.println();
		System.out.println("Primitive Types");
		int x = 3;
		double newdouble = 3.3;
		short newshore = 0x4142;
		long newlong = 0x478172;
		char newchar = 'h';
		float floating = (float) 814.31;
		byte bit = 0x12;
		boolean run = true;
		if(run = true) {
			System.out.printf("short: 0x%x%n", newshore);
			System.out.printf("int: 0x%x%n",x);
			System.out.printf("long: 0x%x%n", newlong);
			System.out.printf("byte: 0x%x%n", bit);
			System.out.println(newchar + " " + floating + " "+ newdouble + " is " + run);
		}
	}
}
public class FinalAssignment extends JavaSkill{

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//
		JavaSkill javaskilled = new JavaSkill();
		JavaSkill primtype = javaskilled.new PrimitiveTypes();
		JavaSkill controls = new ControlStatements();
		Imports imported = new Imports();
		ArrayList<JavaSkills>javaSkills = new ArrayList<JavaSkills>();
		javaSkills.add(primtype);
		javaSkills.add(controls);
		javaSkills.add(imported);
		
		for(JavaSkills skill : javaSkills) {
			skill.doDemo();
			
		}
	
		//
		
	}
}
