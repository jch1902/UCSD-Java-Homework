
public class Stage implements newinterface{

	@Override
	public void create() {
		System.out.println(this.toString() + ": new stage");
	}

	@Override
	public void end() {
		System.out.println(this.toString() + ": stage closed");
	}

	public void getnewInterface() {
		System.out.println(this.toString() + ": getting the new stage");
	}

}
