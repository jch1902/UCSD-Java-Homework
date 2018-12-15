import java.util.ArrayList;

public class FinalAssignment {

	public static void main(String[] args) {
		welcomeMessage();
		PrimitiveType primskill = new PrimitiveType("Primitive Type Skill");
		ControlStatement controlskill = new ControlStatement("Control Statement Skill");
		Import importskill = new Import("Import Skill");
		InstanceSkills newinstance = new InstanceSkills("Instance Methods and Variables");
		StaticSkills newstatic = new StaticSkills("Static Methods and Variables");
		
		
		ArrayList<JavaSkills> javaSkills = new ArrayList<JavaSkills>();
		javaSkills.add(primskill);
		javaSkills.add(controlskill);
		javaSkills.add(newinstance);
		javaSkills.add(newstatic);
		javaSkills.add(new InheritanceSkills());
		javaSkills.add(new PolymorphismSkills());
		javaSkills.add(new InterfaceSkills());
		javaSkills.add(importskill);
		for (JavaSkills skill : javaSkills) {
			skill.doDemo();
		}
	}

	private static void welcomeMessage() {
		System.out.println("Welcome, this is the Final Assignment");
		System.out.println("Coded by Jasper Hoong");
	}

}
