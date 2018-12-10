
public class Computer {
	
	private int accumulator;
	private int[] memory = new int[16];

	// Computer Instructions
	public static final int LOAD = 10;
	public static final int ADD = 11;
	public static final int STORE = 12;
	public static final int SUB = 13;
	public static final int DIV = 14;
	public static final int MULT = 15;
	
	public int getMemorySize() { return memory.length; }
	
	public boolean loadMemory(int[] memory) {
		// Verify memory size not too big
		if (memory.length > this.memory.length) {
			//TODO Maybe throw an exception
			return false; //Memory did not load
		}
		// Copy memory into the the computer
		System.arraycopy(memory, 0, this.memory, 0, memory.length);
		return true;
	}
	public boolean run() {
		int program_counter = 0;
		boolean program_running = true;
		while (program_running) {
			// Get next instruction
			int instruction = memory[program_counter];
			switch (instruction) {
			case Computer.LOAD: 
				program_counter++; //Point to argument for load
				accumulator = memory[program_counter]; //loaded
				program_counter++; //Point to next instruction
				break;
			case Computer.ADD:
				program_counter++; //Point to argument for add
				accumulator += memory[program_counter];
				program_counter++; //Point to next instruction
				break;
			case Computer.STORE:
				program_counter++; //Point to address where to store
				int memory_address = memory[program_counter];
				//Store results
				memory[memory_address] = accumulator;
				program_counter++; //Point to next instruction
				break;
			case Computer.SUB:
				program_counter++;
				accumulator -= memory[program_counter];
				program_counter++;
				break;
			case Computer.MULT:
				program_counter++;
				accumulator *= memory[program_counter];
				break;
			case Computer.DIV:
				program_counter++;
				accumulator /= memory[program_counter];
				break;
			default: //If no instruction, then end program
				program_running = false;
			}
		}
		return true;
	}
	public boolean readMemory(int[] memory) {
		//TOOD error checking
		System.arraycopy(this.memory, 0, memory, 0, this.memory.length);
		return true;
	}
}
