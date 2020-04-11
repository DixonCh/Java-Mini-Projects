//Program to show the exception

public class Exception {
	public static void main(String[] args) {
		try {
			int a, b, c;
			a = 5;
			b = 0;
			c = a / b;
			System.out.println("This will not be printed.");
			System.out.println(c);
		} catch (java.lang.Exception e) {
			System.out.println("Error is caught.");
			System.out.println("Divide by zero.");

		} finally {
			System.out.println("This is finally section.");
		}

	}

}
