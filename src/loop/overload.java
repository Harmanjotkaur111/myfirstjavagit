package loop;

public class overload {

	    // Standard main method (entry point for the JVM)
	    public static void main(String[] args) {
	        System.out.println("Hello from the main method with String array!");
	        
	        // Calling an overloaded main method
	        main(42);
	        main("Hello, overloaded main!");
	    }

	    // Overloaded main method with an integer parameter
	    public static void main(int number) {
	        System.out.println("Hello from the main method with an int: " + number);
	    }

	    // Overloaded main method with a string parameter
	    public static void main(String message) {
	        System.out.println("Hello from the main method with a String: " + message);
	    }
	}


