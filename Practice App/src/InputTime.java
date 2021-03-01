import java.util.Scanner;

public class InputTime {
	
	Scanner scanner;
	String input = "";
	long a = 5 * 1000;
	long b = 10 * 1000;
	
	public InputTime() {
		scanner = new Scanner(System.in);
	}
	
	public void getInput() {
		input = scanner.nextLine();
	}
	
	public long getInputTime() {
		if(input.equals("a")) return a;
		else return b;
	}

}
