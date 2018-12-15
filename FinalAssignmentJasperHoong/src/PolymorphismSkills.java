import java.util.ArrayList;

public class PolymorphismSkills extends JavaSkills{

	public PolymorphismSkills() {
		super("Polymorphism");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doDemo() {
		System.out.println();
		System.out.println("Polymorphism: using Drawing Objects");
		
		ArrayList<DrawingObject> array = new ArrayList<DrawingObject>();
		array.add(new Circle());
		array.add(new Square());
		for(DrawingObject x : array) {
			x.move();
		}
	}

}
