import java.util.Scanner;

public class Utilities {
	public static Object userInput() {
		Scanner input = new Scanner(System.in);
		Object result = input.nextLine();
		input.close();
		return result;
	}
}
