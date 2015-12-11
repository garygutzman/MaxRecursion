public class Recursive {

	public static void main(String[] args) {
		Recursive(0);
	}

	public static void Recursive (int i) {
		try {
			Recursive(i + 1);
		}

		catch (StackOverflowError e) {
			System.out.println("The max recursion is at " + i);
		}
	}
}