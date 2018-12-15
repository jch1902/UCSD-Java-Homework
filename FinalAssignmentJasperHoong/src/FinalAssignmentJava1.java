import java.util.ArrayList;

public class FinalAssignmentJava1 {

	public static void main(String[] args) {
		welcomeMessage();
		PrimitiveType primskill = new PrimitiveType("Primitive Type Skill");
		ControlStatement controlskill = new ControlStatement("Control Statement Skill");
		Import importskill = new Import("Import Skill");
		InstanceSkills newinstance = new InstanceSkills("Instance Methods and Variables");
		
		
		ArrayList<JavaSkills> javaSkills = new ArrayList<JavaSkills>();
		javaSkills.add(primskill);
		javaSkills.add(controlskill);
		javaSkills.add(importskill);
		javaSkills.add(newinstance);
		for (JavaSkills skill : javaSkills) {
			skill.doDemo();
		}
	}

	private static void welcomeMessage() {
		System.out.println("Welcome, this is the Final Assignment");
		System.out.println("Coded by Jasper Hoong");
	}

}
