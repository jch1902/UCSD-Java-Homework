import java.util.Scanner;
public class Import extends JavaSkills {

	public Import(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doDemo() {
		System.out.println();
		System.out.println("Imports");
		Scanner scanner = new Scanner(System.in);
		System.out.println("What would you like for lunch?");
		String food = scanner.nextLine();
		System.out.println(food);
		System.out.println("Scanner imported");
	}

}
