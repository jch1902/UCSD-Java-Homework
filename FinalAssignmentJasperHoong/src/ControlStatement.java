
public class ControlStatement extends JavaSkills{

	public ControlStatement(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doDemo() {
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
