
public class InstanceSkills extends JavaSkills{
	
	private int instanceVarPrivate;
	protected int instanceVarProtected;
	public int instanceVarPublic;
	
	private void instanceMethodPrivate() {}
	protected void instanceMethodProtected() {}
	public void instanceMethodPublic()	{}
	
	
	public InstanceSkills(String name) { 
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doDemo() {
		System.out.println();
		System.out.println("Instance Variables and Instance Methods");
		InstanceDemo demo = new InstanceDemo("new instance");
		System.out.println("demo.InstanceMethodProtected: " + instanceVarProtected);
		System.out.println("demo.instanceMethodPublic: " + demo.instanceVarPublic);
		demo.instanceMethodProtected();
		demo.instanceMethodPublic();
	}
}
