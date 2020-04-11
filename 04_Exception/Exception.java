//Program to show the exception

public class Exception {
	
	public static void main(String[] args) {
		//try block
		try {
			int a, b, c;
			a = 5;
			b = 0;
			c = a / b;
			System.out.println("This will not be printed.");
			System.out.println(c);
		} 
		//catch block
		catch (java.lang.Exception e) {
			System.out.println("Error is caught.");
			System.out.println("Divide by zero.");

		} 
		//finally block
		finally {
			System.out.println("This is finally section.");
		}

	}

}
