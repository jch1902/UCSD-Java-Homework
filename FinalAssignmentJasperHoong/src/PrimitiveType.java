
public class PrimitiveType extends JavaSkills{

	public PrimitiveType(String name) {
		super(name);
	}

	@Override
	public void doDemo() {
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
