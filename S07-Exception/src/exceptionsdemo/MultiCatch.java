package exceptionsdemo;

public class MultiCatch {

	public static void main(String[] args) {

		try {
			String input = args[0];
			System.out.println("Input: " + input);
			int output = Integer.parseInt(input);
			System.out.println("Output: " + output);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Input is required.");
		} catch (NumberFormatException e) {
			System.out.println("Input must be a number");
		}
		System.out.println("Continue with more logic...");
	}

}
