public class ComputerTest {

	public static void main(String[] args) {
		// Create a computer program
		// Using Machine Language
		int[] program = { Computer.LOAD, 1, Computer.ADD, 2, Computer.SUB, 1, 
			Computer.MULT, 5, Computer.DIV, 2, Computer.STORE, 12 };
		
		Computer computer = new Computer();
		computer.loadMemory(program);
		computer.run();
		int[] results = new int[computer.getMemorySize()];
		computer.readMemory(results);
		// If all goes well, location 10 in memory will have result
		System.out.println("results[10]: " + results[10]);
	}

}