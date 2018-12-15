
public class StaticSkills extends JavaSkills{

	private static int staticVarPrivate;
	protected static int staticVarProtected;
	public static int staticVarPublic;
	
	private static void staticMethodPrivate() {}
	protected static void staticMethodProtected() {System.out.println("Method protected");}
	public static void staticMethodPublic() {}
	
	
	public StaticSkills(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doDemo() {
		System.out.println();
		System.out.println("Static Skills");
		System.out.println("Static Protected: " + StaticDemo.staticVarProtected);
		System.out.println("Static Public: " + StaticDemo.staticVarPublic);
		StaticDemo.staticMethodProtected();
		StaticDemo.staticMethodPublic();
	}

}
