import java.util.ArrayList;

public class InterfaceSkills extends JavaSkills {

	public InterfaceSkills() {
		super("InterfaceSkills");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doDemo() {
		System.out.println();
		System.out.println("different classes implementing same interface");
		ArrayList<newinterface> stages = new ArrayList<newinterface>();
		stages.add(new backstage());
		stages.add(new Stage());
		for(newinterface x : stages) {
			x.create();
			x.getnewInterface();
			x.end();
		}
	}

}
