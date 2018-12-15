
public class backstage implements newinterface{
	public void create() {
		System.out.println(this.toString() + ": new stage");
	}

	public void end() {
		System.out.println(this.toString() + ": stage closed");
	}

	public void getnewInterface() {
		System.out.println(this.toString() + ": getting the new stage");
	}
}
